# Change Log

## [Unreleased](https://github.com/OrbitzWorldwide/consul-client/tree/HEAD)

[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.13.0...HEAD)

**Closed issues:**

- Changelog [\#167](https://github.com/OrbitzWorldwide/consul-client/issues/167)
- EnableTagOverride support during service registration [\#164](https://github.com/OrbitzWorldwide/consul-client/issues/164)

**Merged pull requests:**

- Add node membership watch capabilities [\#169](https://github.com/OrbitzWorldwide/consul-client/pull/169) ([killerwhile](https://github.com/killerwhile))
- Support the new DeregisterCriticalServerAfter option in Consul 0.7 [\#168](https://github.com/OrbitzWorldwide/consul-client/pull/168) ([jplock](https://github.com/jplock))
- Support the new DeregisterCriticalServerAfter option in Consul 0.7 [\#165](https://github.com/OrbitzWorldwide/consul-client/pull/165) ([jplock](https://github.com/jplock))
- Enable additional query options for caches [\#163](https://github.com/OrbitzWorldwide/consul-client/pull/163) ([yfouquet-criteo](https://github.com/yfouquet-criteo))

## [0.13.0](https://github.com/OrbitzWorldwide/consul-client/tree/0.13.0) (2016-09-21)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.12.8...0.13.0)

**Merged pull requests:**

- Build non-shaded jar as well as shaded [\#162](https://github.com/OrbitzWorldwide/consul-client/pull/162) ([DWvanGeest](https://github.com/DWvanGeest))

## [0.12.8](https://github.com/OrbitzWorldwide/consul-client/tree/0.12.8) (2016-09-20)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.12.7...0.12.8)

**Closed issues:**

- Can we simulate consul Exec command using consul-client [\#155](https://github.com/OrbitzWorldwide/consul-client/issues/155)
- Using the Builder to create a Consul Object, URL is cutted [\#142](https://github.com/OrbitzWorldwide/consul-client/issues/142)

**Merged pull requests:**

- Check for error responses when using callbacks [\#161](https://github.com/OrbitzWorldwide/consul-client/pull/161) ([trevorr](https://github.com/trevorr))
- set index and lastContact in ConsulResponse to 0 instead of -1 if header's aren't present [\#158](https://github.com/OrbitzWorldwide/consul-client/pull/158) ([jeinwag](https://github.com/jeinwag))

## [0.12.7](https://github.com/OrbitzWorldwide/consul-client/tree/0.12.7) (2016-08-30)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.12.6...0.12.7)

**Closed issues:**

- New release including \#153 [\#154](https://github.com/OrbitzWorldwide/consul-client/issues/154)
- ConsulCache say that "Error getting response from consul. will retry in 10 SECONDS" but retry is within the same second 09:16:34 [\#151](https://github.com/OrbitzWorldwide/consul-client/issues/151)
- Unable to extract the trust manager on com.orbitz.okhttp3.internal.Platform@406554a0, sslSocketFactory is class sun.security.ssl.SSLSocketFactoryImpl [\#150](https://github.com/OrbitzWorldwide/consul-client/issues/150)
- How can i do health check with a specify serviceId ? Not a service name [\#146](https://github.com/OrbitzWorldwide/consul-client/issues/146)

**Merged pull requests:**

- add null check for X-Consul-Index header [\#153](https://github.com/OrbitzWorldwide/consul-client/pull/153) ([jeinwag](https://github.com/jeinwag))

## [0.12.6](https://github.com/OrbitzWorldwide/consul-client/tree/0.12.6) (2016-07-30)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.12.5...0.12.6)

**Implemented enhancements:**

- Support for ACL client [\#102](https://github.com/OrbitzWorldwide/consul-client/issues/102)

**Closed issues:**

- Health client not compatible with consul 0.5.2 [\#149](https://github.com/OrbitzWorldwide/consul-client/issues/149)
- ConsulCache empty if consul has no leader [\#148](https://github.com/OrbitzWorldwide/consul-client/issues/148)
- HostnameVerifier [\#145](https://github.com/OrbitzWorldwide/consul-client/issues/145)

## [0.12.5](https://github.com/OrbitzWorldwide/consul-client/tree/0.12.5) (2016-07-25)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.12.4...0.12.5)

**Closed issues:**

- Support Notes for Checks [\#141](https://github.com/OrbitzWorldwide/consul-client/issues/141)
- KVCache dose not closes properly [\#133](https://github.com/OrbitzWorldwide/consul-client/issues/133)

**Merged pull requests:**

- dispatcher threads as daemon threads [\#147](https://github.com/OrbitzWorldwide/consul-client/pull/147) ([gjesse](https://github.com/gjesse))
- Tests using embedded-consul instead of travis.yml script [\#144](https://github.com/OrbitzWorldwide/consul-client/pull/144) ([pszymczyk](https://github.com/pszymczyk))
- add notes to check registration for http, tcp and script checks [\#143](https://github.com/OrbitzWorldwide/consul-client/pull/143) ([Bryann](https://github.com/Bryann))

## [0.12.4](https://github.com/OrbitzWorldwide/consul-client/tree/0.12.4) (2016-07-08)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.12.3...0.12.4)

**Closed issues:**

- Support Timeout for Checks [\#140](https://github.com/OrbitzWorldwide/consul-client/issues/140)
- java.lang.IllegalStateException: Unable to extract the trust manager on com.orbitz.okhttp3.internal.Platform, sslSocketFactory is class sun.security.ssl.SSLSocketFactoryImpl [\#138](https://github.com/OrbitzWorldwide/consul-client/issues/138)
- ConsulCache throws java.net.SocketTimeoutException: timeout  [\#135](https://github.com/OrbitzWorldwide/consul-client/issues/135)

**Merged pull requests:**

- Bump retrofit version to latest Fix issue \#138 \[Unable to extract the… [\#139](https://github.com/OrbitzWorldwide/consul-client/pull/139) ([dkubiak](https://github.com/dkubiak))
- Exposes listeners in ConsulCache [\#136](https://github.com/OrbitzWorldwide/consul-client/pull/136) ([laissandrade](https://github.com/laissandrade))

## [0.12.3](https://github.com/OrbitzWorldwide/consul-client/tree/0.12.3) (2016-05-31)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.12.2...0.12.3)

**Merged pull requests:**

- Adds HealthCheckCache for health api /v1/health/state/\<state\> [\#134](https://github.com/OrbitzWorldwide/consul-client/pull/134) ([laissandrade](https://github.com/laissandrade))

## [0.12.2](https://github.com/OrbitzWorldwide/consul-client/tree/0.12.2) (2016-05-26)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.12.1...0.12.2)

**Closed issues:**

- Typo for cas on PutOptions [\#132](https://github.com/OrbitzWorldwide/consul-client/issues/132)

## [0.12.1](https://github.com/OrbitzWorldwide/consul-client/tree/0.12.1) (2016-05-23)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.12.0...0.12.1)

**Closed issues:**

- getKeys\(\) causes an exception to be thrown [\#131](https://github.com/OrbitzWorldwide/consul-client/issues/131)
- getKeys\(\) throws ConsulException [\#130](https://github.com/OrbitzWorldwide/consul-client/issues/130)
- Shadow jar as one of the options [\#128](https://github.com/OrbitzWorldwide/consul-client/issues/128)

## [0.12.0](https://github.com/OrbitzWorldwide/consul-client/tree/0.12.0) (2016-05-19)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.11.3...0.12.0)

**Closed issues:**

- Values in KV surrounded by quotation marks [\#123](https://github.com/OrbitzWorldwide/consul-client/issues/123)

**Merged pull requests:**

- Support "TaggedAddresses" field [\#129](https://github.com/OrbitzWorldwide/consul-client/pull/129) ([odiszapc](https://github.com/odiszapc))
- Typo [\#127](https://github.com/OrbitzWorldwide/consul-client/pull/127) ([odiszapc](https://github.com/odiszapc))
- Customize configuration of Consul client [\#126](https://github.com/OrbitzWorldwide/consul-client/pull/126) ([odiszapc](https://github.com/odiszapc))
- Add compatibility with Consul v0.6.4, update libraries [\#125](https://github.com/OrbitzWorldwide/consul-client/pull/125) ([odiszapc](https://github.com/odiszapc))

## [0.11.3](https://github.com/OrbitzWorldwide/consul-client/tree/0.11.3) (2016-05-05)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.11.2...0.11.3)

**Closed issues:**

- Shaded packages [\#118](https://github.com/OrbitzWorldwide/consul-client/issues/118)

**Merged pull requests:**

- Introduced acl and auth support [\#122](https://github.com/OrbitzWorldwide/consul-client/pull/122) ([YannRobert](https://github.com/YannRobert))
- Introduced a new parameter 'ping' to the Consul.Builder [\#121](https://github.com/OrbitzWorldwide/consul-client/pull/121) ([YannRobert](https://github.com/YannRobert))

## [0.11.2](https://github.com/OrbitzWorldwide/consul-client/tree/0.11.2) (2016-05-03)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.11.1...0.11.2)

**Closed issues:**

- v0.11.x behavior [\#120](https://github.com/OrbitzWorldwide/consul-client/issues/120)

## [0.11.1](https://github.com/OrbitzWorldwide/consul-client/tree/0.11.1) (2016-05-02)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.11.0...0.11.1)

**Implemented enhancements:**

- Replace JAX-RS \(and maybe Jackson\) [\#93](https://github.com/OrbitzWorldwide/consul-client/issues/93)

**Closed issues:**

- Jackson Guava module [\#115](https://github.com/OrbitzWorldwide/consul-client/issues/115)
- Dependency conflict [\#114](https://github.com/OrbitzWorldwide/consul-client/issues/114)
- KeyValueClient.getValues\(String, QueryOptions\) ignores queryOptions [\#112](https://github.com/OrbitzWorldwide/consul-client/issues/112)

**Merged pull requests:**

- revert osgi [\#119](https://github.com/OrbitzWorldwide/consul-client/pull/119) ([lburgazzoli](https://github.com/lburgazzoli))
- Add support for OSGi [\#117](https://github.com/OrbitzWorldwide/consul-client/pull/117) ([lburgazzoli](https://github.com/lburgazzoli))

## [0.11.0](https://github.com/OrbitzWorldwide/consul-client/tree/0.11.0) (2016-05-02)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.10.2...0.11.0)

**Implemented enhancements:**

- Prepared Query support in consul-client [\#95](https://github.com/OrbitzWorldwide/consul-client/issues/95)

## [0.10.2](https://github.com/OrbitzWorldwide/consul-client/tree/0.10.2) (2016-04-26)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.10.1...0.10.2)

**Implemented enhancements:**

- OSGi Support? [\#84](https://github.com/OrbitzWorldwide/consul-client/issues/84)

**Closed issues:**

- Fix for intelli-j generated sources [\#111](https://github.com/OrbitzWorldwide/consul-client/issues/111)
- KVCache will truncate keys in the key map [\#110](https://github.com/OrbitzWorldwide/consul-client/issues/110)

**Merged pull requests:**

- OSGi support \#84 [\#116](https://github.com/OrbitzWorldwide/consul-client/pull/116) ([lburgazzoli](https://github.com/lburgazzoli))

## [0.10.1](https://github.com/OrbitzWorldwide/consul-client/tree/0.10.1) (2016-03-16)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.10.0...0.10.1)

**Fixed bugs:**

- Events doesn't filtered by name [\#99](https://github.com/OrbitzWorldwide/consul-client/issues/99)

**Closed issues:**

- KVClient: PutOptions.getCas should be long, not int [\#107](https://github.com/OrbitzWorldwide/consul-client/issues/107)
- Support to specify a service-specific IP address [\#106](https://github.com/OrbitzWorldwide/consul-client/issues/106)
- com.orbitz.consul.model.kv.Value -  This class does not define a public default constructor, or the constructor raised an exception [\#76](https://github.com/OrbitzWorldwide/consul-client/issues/76)

**Merged pull requests:**

- KVClient: synchronous getValues with  QueryOptions [\#109](https://github.com/OrbitzWorldwide/consul-client/pull/109) ([art4noir](https://github.com/art4noir))
- KVClient: PutOptions.getCas should be long, not int [\#108](https://github.com/OrbitzWorldwide/consul-client/pull/108) ([art4noir](https://github.com/art4noir))
- provide a better unique key for ServiceHealthCache by including the S… [\#105](https://github.com/OrbitzWorldwide/consul-client/pull/105) ([gjesse](https://github.com/gjesse))
- fix a case where a client waiting on initialization will try to acces… [\#104](https://github.com/OrbitzWorldwide/consul-client/pull/104) ([gjesse](https://github.com/gjesse))

## [0.10.0](https://github.com/OrbitzWorldwide/consul-client/tree/0.10.0) (2016-03-01)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.16...0.10.0)

**Closed issues:**

- Support for TCP health check [\#103](https://github.com/OrbitzWorldwide/consul-client/issues/103)
- Agent Self throwing HTTP 503. [\#101](https://github.com/OrbitzWorldwide/consul-client/issues/101)
- Clarification--CheckID does not have associated TTL [\#100](https://github.com/OrbitzWorldwide/consul-client/issues/100)
- Error getting response from consul. will retry in 10 SECONDS: java.lang.IllegalArgumentException: Multiple entries with same key: [\#96](https://github.com/OrbitzWorldwide/consul-client/issues/96)
- Issue connecting to remote consul endpoint [\#91](https://github.com/OrbitzWorldwide/consul-client/issues/91)
- Missing fields for session creation [\#66](https://github.com/OrbitzWorldwide/consul-client/issues/66)
- Securing HTTP API calls with ACLs? [\#64](https://github.com/OrbitzWorldwide/consul-client/issues/64)

**Merged pull requests:**

- tolerates Consul providing duplicate keys [\#97](https://github.com/OrbitzWorldwide/consul-client/pull/97) ([jhovell](https://github.com/jhovell))

## [0.9.16](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.16) (2016-01-05)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.15...0.9.16)

**Closed issues:**

- Support for registering a service using an ACL [\#87](https://github.com/OrbitzWorldwide/consul-client/issues/87)
- Consul Cache [\#81](https://github.com/OrbitzWorldwide/consul-client/issues/81)

**Merged pull requests:**

- Improves compatibility with Resteasy though ContextResolvers [\#89](https://github.com/OrbitzWorldwide/consul-client/pull/89) ([jhovell](https://github.com/jhovell))
- Add support for QueryOptions for service registration [\#88](https://github.com/OrbitzWorldwide/consul-client/pull/88) ([dopuskh3](https://github.com/dopuskh3))

## [0.9.15](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.15) (2015-12-17)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.14...0.9.15)

**Fixed bugs:**

- Connection Leaks :\(  [\#86](https://github.com/OrbitzWorldwide/consul-client/issues/86)

**Closed issues:**

- Consistency mode not passed in request [\#85](https://github.com/OrbitzWorldwide/consul-client/issues/85)

## [0.9.14](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.14) (2015-11-19)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.13...0.9.14)

## [0.9.13](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.13) (2015-11-19)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.12...0.9.13)

**Closed issues:**

- Spring boot application throws Exception - FYI [\#83](https://github.com/OrbitzWorldwide/consul-client/issues/83)
- com.orbitz.consul.option.QueryOptionsBuilder missing [\#79](https://github.com/OrbitzWorldwide/consul-client/issues/79)
- Inconsistency between expected jackson deserialized collections classes and immutable collections in generated classes. [\#78](https://github.com/OrbitzWorldwide/consul-client/issues/78)
- Incorrect key in kvCache map [\#75](https://github.com/OrbitzWorldwide/consul-client/issues/75)
- SSL/TLS support [\#73](https://github.com/OrbitzWorldwide/consul-client/issues/73)
- General question about popular integration patterns for service registration in consul [\#72](https://github.com/OrbitzWorldwide/consul-client/issues/72)

**Merged pull requests:**

- Changing character n to m for minutes [\#82](https://github.com/OrbitzWorldwide/consul-client/pull/82) ([nickspat](https://github.com/nickspat))
- fixes \#79 [\#80](https://github.com/OrbitzWorldwide/consul-client/pull/80) ([gjesse](https://github.com/gjesse))
- \#75 KVCache:keyExtractor substring update [\#77](https://github.com/OrbitzWorldwide/consul-client/pull/77) ([dnance](https://github.com/dnance))

## [0.9.12](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.12) (2015-11-04)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.11...0.9.12)

**Closed issues:**

- KeyValueClient.putValue with PutOptions is private [\#74](https://github.com/OrbitzWorldwide/consul-client/issues/74)

## [0.9.11](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.11) (2015-10-23)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.10...0.9.11)

**Closed issues:**

- Renew session always returns true [\#70](https://github.com/OrbitzWorldwide/consul-client/issues/70)
- thread safety? [\#69](https://github.com/OrbitzWorldwide/consul-client/issues/69)
- ID field on service check [\#68](https://github.com/OrbitzWorldwide/consul-client/issues/68)
- ConsulCache can't be stopped [\#65](https://github.com/OrbitzWorldwide/consul-client/issues/65)
- Error establiching connection with consul server [\#56](https://github.com/OrbitzWorldwide/consul-client/issues/56)

**Merged pull requests:**

- rework SessionClient [\#71](https://github.com/OrbitzWorldwide/consul-client/pull/71) ([rickfast](https://github.com/rickfast))
- Add a stop\(\) method to ConsulCache - fixes \#65 [\#67](https://github.com/OrbitzWorldwide/consul-client/pull/67) ([gjesse](https://github.com/gjesse))

## [0.9.10](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.10) (2015-09-08)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.9...0.9.10)

**Closed issues:**

- ImmutablePutOptions is missing [\#61](https://github.com/OrbitzWorldwide/consul-client/issues/61)
- Add ability to register multiple checks per service [\#59](https://github.com/OrbitzWorldwide/consul-client/issues/59)

**Merged pull requests:**

- eclipse instructions update [\#63](https://github.com/OrbitzWorldwide/consul-client/pull/63) ([gjesse](https://github.com/gjesse))
- Add ability to register multiple checks per service. Fixes \#59 [\#62](https://github.com/OrbitzWorldwide/consul-client/pull/62) ([gjesse](https://github.com/gjesse))
- Fixes logging error in ConsulCache [\#60](https://github.com/OrbitzWorldwide/consul-client/pull/60) ([dennisgove](https://github.com/dennisgove))

## [0.9.9](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.9) (2015-08-31)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.8...0.9.9)

**Closed issues:**

- Consul patterns fro service discovery and config management [\#58](https://github.com/OrbitzWorldwide/consul-client/issues/58)
- null kv values [\#48](https://github.com/OrbitzWorldwide/consul-client/issues/48)

**Merged pull requests:**

- Added dev section to README, include a cache example. [\#57](https://github.com/OrbitzWorldwide/consul-client/pull/57) ([gjesse](https://github.com/gjesse))
- Ensure that listeners added post-initialization get the current state… [\#55](https://github.com/OrbitzWorldwide/consul-client/pull/55) ([gjesse](https://github.com/gjesse))
- Using arrays for tags breaks equality checks - use list instead [\#54](https://github.com/OrbitzWorldwide/consul-client/pull/54) ([gjesse](https://github.com/gjesse))
- Use HostAndPort for service health keys to allow the possibility of m… [\#53](https://github.com/OrbitzWorldwide/consul-client/pull/53) ([gjesse](https://github.com/gjesse))
- fix up output on check and fix agent tests [\#52](https://github.com/OrbitzWorldwide/consul-client/pull/52) ([gjesse](https://github.com/gjesse))
- Allow PUT of empty entity, support recursive delete, some minor doc f… [\#51](https://github.com/OrbitzWorldwide/consul-client/pull/51) ([gjesse](https://github.com/gjesse))

## [0.9.8](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.8) (2015-08-09)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.7...0.9.8)

**Closed issues:**

- Immutables & java8 [\#42](https://github.com/OrbitzWorldwide/consul-client/issues/42)
- Serialization Discrepancy in SessionInfo [\#40](https://github.com/OrbitzWorldwide/consul-client/issues/40)

**Merged pull requests:**

- a general cache object with KV and ServiceHealth implementations, and… [\#50](https://github.com/OrbitzWorldwide/consul-client/pull/50) ([gjesse](https://github.com/gjesse))
- make decoding the responsibility of the value object, more Optional u… [\#49](https://github.com/OrbitzWorldwide/consul-client/pull/49) ([gjesse](https://github.com/gjesse))
- used more immutables for options to cleanup builders & some redundant… [\#47](https://github.com/OrbitzWorldwide/consul-client/pull/47) ([gjesse](https://github.com/gjesse))
- more immutability [\#46](https://github.com/OrbitzWorldwide/consul-client/pull/46) ([gjesse](https://github.com/gjesse))
- migrated agent models to immutables plus a few minor fixes [\#45](https://github.com/OrbitzWorldwide/consul-client/pull/45) ([gjesse](https://github.com/gjesse))
- there was some weird stuff going on here [\#44](https://github.com/OrbitzWorldwide/consul-client/pull/44) ([gjesse](https://github.com/gjesse))
- Fix a regression introduced in the previous commit, and reference all… [\#43](https://github.com/OrbitzWorldwide/consul-client/pull/43) ([gjesse](https://github.com/gjesse))
- async getValue call returned a list instead of a single value [\#41](https://github.com/OrbitzWorldwide/consul-client/pull/41) ([gjesse](https://github.com/gjesse))
- X-Consul-Index is stored in an unsigned 64-bit integer [\#39](https://github.com/OrbitzWorldwide/consul-client/pull/39) ([hrmohr](https://github.com/hrmohr))

## [0.9.7](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.7) (2015-07-20)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.6...0.9.7)

**Closed issues:**

- Open connections increasing without cleaning up [\#37](https://github.com/OrbitzWorldwide/consul-client/issues/37)
- Documention appears incorrect for Pass/Check [\#36](https://github.com/OrbitzWorldwide/consul-client/issues/36)
- Member from Agent Domain Object [\#34](https://github.com/OrbitzWorldwide/consul-client/issues/34)
- Publish artifacts to maven central [\#32](https://github.com/OrbitzWorldwide/consul-client/issues/32)

**Merged pull requests:**

- Ensure response is closed on session renewal [\#38](https://github.com/OrbitzWorldwide/consul-client/pull/38) ([tartale](https://github.com/tartale))

## [0.9.6](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.6) (2015-06-26)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.5...0.9.6)

## [0.9.5](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.5) (2015-06-23)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.4...0.9.5)

**Closed issues:**

- Agent join is not supported [\#33](https://github.com/OrbitzWorldwide/consul-client/issues/33)
- Add client support for Watches [\#31](https://github.com/OrbitzWorldwide/consul-client/issues/31)

**Merged pull requests:**

- Asynchronous key/value store [\#30](https://github.com/OrbitzWorldwide/consul-client/pull/30) ([Marmelatze](https://github.com/Marmelatze))
- add acl token to QueryOptions [\#27](https://github.com/OrbitzWorldwide/consul-client/pull/27) ([jfoutz](https://github.com/jfoutz))

## [0.9.4](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.4) (2015-06-13)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.3-for-real...0.9.4)

**Closed issues:**

- register interface do not have address field [\#28](https://github.com/OrbitzWorldwide/consul-client/issues/28)
- Add static method in State to get it by name [\#24](https://github.com/OrbitzWorldwide/consul-client/issues/24)

**Merged pull requests:**

- added the ability to register an application-level check [\#29](https://github.com/OrbitzWorldwide/consul-client/pull/29) ([amirkibbar](https://github.com/amirkibbar))
- Added address field for Service [\#26](https://github.com/OrbitzWorldwide/consul-client/pull/26) ([Suvitruf](https://github.com/Suvitruf))

## [0.9.3-for-real](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.3-for-real) (2015-05-29)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.3...0.9.3-for-real)

## [0.9.3](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.3) (2015-05-29)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.2...0.9.3)

## [0.9.2](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.2) (2015-05-28)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9.1...0.9.2)

**Merged pull requests:**

- Create new client url method [\#23](https://github.com/OrbitzWorldwide/consul-client/pull/23) ([robinmeiss](https://github.com/robinmeiss))

## [0.9.1](https://github.com/OrbitzWorldwide/consul-client/tree/0.9.1) (2015-05-25)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.9...0.9.1)

**Merged pull requests:**

- Added renew to session info, fixed pom file [\#21](https://github.com/OrbitzWorldwide/consul-client/pull/21) ([weberr13](https://github.com/weberr13))

## [0.9](https://github.com/OrbitzWorldwide/consul-client/tree/0.9) (2015-05-15)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.8.4...0.9)

**Implemented enhancements:**

- HTTP checks [\#15](https://github.com/OrbitzWorldwide/consul-client/issues/15)

**Merged pull requests:**

- update libraries, and make cxf optional [\#19](https://github.com/OrbitzWorldwide/consul-client/pull/19) ([gjesse](https://github.com/gjesse))
- Avoid NPE in KeyValueClient\#getSession [\#18](https://github.com/OrbitzWorldwide/consul-client/pull/18) ([mhurne](https://github.com/mhurne))
- Fix constant names. Add more javadocs. [\#17](https://github.com/OrbitzWorldwide/consul-client/pull/17) ([shuraa](https://github.com/shuraa))
- Added one more factory method with ability to specify custom ClientBu… [\#16](https://github.com/OrbitzWorldwide/consul-client/pull/16) ([shuraa](https://github.com/shuraa))
- Fixed example code in README [\#14](https://github.com/OrbitzWorldwide/consul-client/pull/14) ([happymap](https://github.com/happymap))
- Fixed a README typo [\#13](https://github.com/OrbitzWorldwide/consul-client/pull/13) ([happymap](https://github.com/happymap))

## [0.8.4](https://github.com/OrbitzWorldwide/consul-client/tree/0.8.4) (2015-04-24)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.8.3-for_real...0.8.4)

## [0.8.3-for_real](https://github.com/OrbitzWorldwide/consul-client/tree/0.8.3-for_real) (2015-04-24)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.8.3...0.8.3-for_real)

**Closed issues:**

- Clarification [\#12](https://github.com/OrbitzWorldwide/consul-client/issues/12)

**Merged pull requests:**

- Added SessionClient and Leader Election-related methods [\#11](https://github.com/OrbitzWorldwide/consul-client/pull/11) ([vascokk](https://github.com/vascokk))

## [0.8.3](https://github.com/OrbitzWorldwide/consul-client/tree/0.8.3) (2015-04-07)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.8.2...0.8.3)

## [0.8.2](https://github.com/OrbitzWorldwide/consul-client/tree/0.8.2) (2015-03-05)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.8.1...0.8.2)

## [0.8.1](https://github.com/OrbitzWorldwide/consul-client/tree/0.8.1) (2015-03-05)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.8...0.8.1)

**Merged pull requests:**

- add flags to keyvalue puts [\#10](https://github.com/OrbitzWorldwide/consul-client/pull/10) ([shawngardner](https://github.com/shawngardner))
- ServiceAddress is configurable and available via service inspection in newer versions of Consul's HTTP API [\#9](https://github.com/OrbitzWorldwide/consul-client/pull/9) ([thongsav-usgs](https://github.com/thongsav-usgs))

## [0.8](https://github.com/OrbitzWorldwide/consul-client/tree/0.8) (2015-01-26)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.7.1...0.8)

**Merged pull requests:**

- Fixed javadoc url [\#8](https://github.com/OrbitzWorldwide/consul-client/pull/8) ([cschroed-usgs](https://github.com/cschroed-usgs))
- Less state agent client [\#7](https://github.com/OrbitzWorldwide/consul-client/pull/7) ([cschroed-usgs](https://github.com/cschroed-usgs))
- Enabling tests to pass on machines with multiple network adapters. [\#6](https://github.com/OrbitzWorldwide/consul-client/pull/6) ([cschroed-usgs](https://github.com/cschroed-usgs))
- Preventing intermittent test failure [\#5](https://github.com/OrbitzWorldwide/consul-client/pull/5) ([cschroed-usgs](https://github.com/cschroed-usgs))

## [0.7.1](https://github.com/OrbitzWorldwide/consul-client/tree/0.7.1) (2015-01-12)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.7...0.7.1)

**Merged pull requests:**

- Explicitly set the message from the response body. [\#4](https://github.com/OrbitzWorldwide/consul-client/pull/4) ([cjcdoomed](https://github.com/cjcdoomed))

## [0.7](https://github.com/OrbitzWorldwide/consul-client/tree/0.7) (2015-01-09)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.6...0.7)

**Merged pull requests:**

- Added code to handle unsuccessful http response codes [\#3](https://github.com/OrbitzWorldwide/consul-client/pull/3) ([cjcdoomed](https://github.com/cjcdoomed))
- Fix XML node closing in README [\#2](https://github.com/OrbitzWorldwide/consul-client/pull/2) ([isuftin](https://github.com/isuftin))

## [0.6](https://github.com/OrbitzWorldwide/consul-client/tree/0.6) (2014-12-16)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.5...0.6)

## [0.5](https://github.com/OrbitzWorldwide/consul-client/tree/0.5) (2014-11-06)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.4.4...0.5)

## [0.4.4](https://github.com/OrbitzWorldwide/consul-client/tree/0.4.4) (2014-11-05)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.4.2...0.4.4)

## [0.4.2](https://github.com/OrbitzWorldwide/consul-client/tree/0.4.2) (2014-10-28)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.4.3...0.4.2)

## [0.4.3](https://github.com/OrbitzWorldwide/consul-client/tree/0.4.3) (2014-10-28)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.4.1...0.4.3)

**Merged pull requests:**

- Fix bug that overwrites query options for blocking timeout [\#1](https://github.com/OrbitzWorldwide/consul-client/pull/1) ([gburton1](https://github.com/gburton1))

## [0.4.1](https://github.com/OrbitzWorldwide/consul-client/tree/0.4.1) (2014-10-08)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.4...0.4.1)

## [0.4](https://github.com/OrbitzWorldwide/consul-client/tree/0.4) (2014-09-22)
[Full Changelog](https://github.com/OrbitzWorldwide/consul-client/compare/0.3...0.4)

## [0.3](https://github.com/OrbitzWorldwide/consul-client/tree/0.3) (2014-09-18)


\* *This Change Log was automatically generated by [github_changelog_generator](https://github.com/skywinder/Github-Changelog-Generator)*