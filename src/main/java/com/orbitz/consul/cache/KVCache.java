package com.orbitz.consul.cache;

import com.google.common.base.Function;
import com.google.common.collect.Sets;
import com.orbitz.consul.KeyValueClient;
import com.orbitz.consul.async.ConsulResponseCallback;
import com.orbitz.consul.model.kv.Value;
import com.orbitz.consul.option.QueryOptions;
import org.apache.commons.lang3.StringUtils;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class KVCache extends ConsulCache<String, Value> {

    private KVCache(Function<Value, String> keyConversion, ConsulCache.CallbackConsumer<Value> callbackConsumer) {
        super(keyConversion, callbackConsumer);
    }

    public static KVCache newCache(
            final KeyValueClient kvClient,
            final String rootPath,
            final int watchSeconds,
            final QueryOptions queryOptions) {

        final String rootPathWithTrailingSlash = rootPath.endsWith("/") ? rootPath : rootPath + "/";
        final int rootPathWithTrailingSlashLength = rootPathWithTrailingSlash.length();

        final Function<Value, String> keyExtractor = new Function<Value, String>() {
            @Override
            public String apply(Value input) {
                if (input == null) {
                    throw new RuntimeException("Input to key extractor is null");
                }
                if (input.getKey() == null) {
                    throw new RuntimeException("Input to key extractor has no key");
                }

                if (input.getKey().startsWith(rootPathWithTrailingSlash)) {
                    return input.getKey().substring(rootPathWithTrailingSlashLength);
                } else {
                    throw new RuntimeException(String.format("Got value for key %s but root is %s",
                        input.getKey(), rootPathWithTrailingSlash));
                }
            }
        };

        final CallbackConsumer<Value> callbackConsumer = new CallbackConsumer<Value>() {
            @Override
            public void consume(BigInteger index, ConsulResponseCallback<List<Value>> callback) {
                QueryOptions params = watchParams(index, watchSeconds, queryOptions);
                kvClient.getValues(rootPath, params, callback);
            }
        };

        return new KVCache(keyExtractor, callbackConsumer);
    }

    /**
     * Factory method to construct a String/{@link Value} map.
     *
     * @param kvClient the {@link KeyValueClient} to use
     * @param rootPath the root path (will be stripped from keys in the cache)
     * @param watchSeconds how long to tell the Consul server to wait for new values (note that
     *                     if this is 60 seconds or more, the client's read timeout will need
     *                     to be increased as well)
     * @return the cache object
     */
    public static KVCache newCache(
            final KeyValueClient kvClient,
            final String rootPath,
            final int watchSeconds) {
        return newCache(kvClient, rootPath, watchSeconds, QueryOptions.BLANK);
    }

    /**
     * Factory method to construct a String/{@link Value} map with a 10 second
     * block interval
     *
     * @param kvClient the {@link KeyValueClient} to use
     * @param rootPath the root path
     * @return the cache object
     */
    public static KVCache newCache(
            final KeyValueClient kvClient,
            final String rootPath) {
        return newCache(kvClient, rootPath, 10);
    }
}
