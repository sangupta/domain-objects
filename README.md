domain-objects
==============

[![Build Status](https://travis-ci.org/sangupta/domain-objects.svg?branch=master)](https://travis-ci.org/sangupta/domain-objects)
[![Coverage Status](https://coveralls.io/repos/sangupta/domain-objects/badge.png)](https://coveralls.io/r/sangupta/domain-objects)
[![Maven Version](https://maven-badges.herokuapp.com/maven-central/com.sangupta/domain-objects/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.sangupta/domain-objects)


Contract and implementations for common-useful domain objects

`domain-objects` provide a useful bundle of commonly used domain objects, and some
interface contracts that domain objects can implement to allow for objects to be passed
between different components and services. These contracts are also used to implement
interceptors for say updating the timestamp whenever an object is persisted into a data
store.

_History:_ Ages ago, the project forked from the `https://github.com/sangupta/jerry` project, when all utility classes were extracted
out into the `domain-objects` project.

The library is tested on the following JDK versions:

* Oracle JDK 8
* Oracle JDK 7
* Open JDK 7

**Change Log**

Downloads
---------

The latest released library can be downloaded from Maven Central using:

```xml
<dependency>
    <groupId>com.sangupta</groupId>
    <artifactId>domain-objects</artifactId>
    <version>1.0.0</version>
</dependency>
```

The current development snapshot `JAR` can be obtained using `JitPack.io` as:

Add the following `repository` to Maven,

```xml
<repository>
	<id>jitpack.io</id>
	<url>https://jitpack.io</url>
</repository>
```

Then add the dependency as,

```xml
<dependency>
    <groupId>com.github.sangupta</groupId>
    <artifactId>jerry-core</artifactId>
    <version>1.0.1-SNAPSHOT</version>
</dependency>
```

Versioning
----------

For transparency and insight into our release cycle, and for striving to maintain backward compatibility, 
`domain-objects` will be maintained under the Semantic Versioning guidelines as much as possible.

Releases will be numbered with the follow format:

`<major>.<minor>.<patch>`

And constructed with the following guidelines:

* Breaking backward compatibility bumps the major
* New additions without breaking backward compatibility bumps the minor
* Bug fixes and misc changes bump the patch

For more information on SemVer, please visit http://semver.org/.

License
-------
	
```
domain-objects - Contract and implementations for common-useful domain objects
Copyright (c) 2016, Sandeep Gupta

http://sangupta.com/projects/domain-objects

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

	http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
