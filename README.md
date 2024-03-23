# junit5-native-image-annotation-test

- For https://github.com/apache/shardingsphere/pull/30031 .

- Execute the following command on the Ubuntu 22.04.3 instance with `SDKMAN!` installed.

```shell
sdk install java 21.0.2-graalce
sdk use java 21.0.2-graalce

git clone git@github.com:linghengqian/junit5-native-image-annotation-test.git
cd ./junit5-native-image-annotation-test/
./mvnw -T1C -e clean test
./mvnw -PnativeTestInJunit -T1C -e clean test
```

- Log.
```shell
$ ./mvnw -PnativeTestInJunit -T1C -e clean test
[INFO] Error stacktraces are turned on.
[INFO] Scanning for projects...
[INFO] 
[INFO] Using the MultiThreadedBuilder implementation with a thread count of 16
[INFO] 
[INFO] -----------< com.lingh:junit5-native-image-annotation-test >------------
[INFO] Building junit5-native-image-annotation-test 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ junit5-native-image-annotation-test ---
[INFO] Deleting /home/linghengqian/IdeaProjects/junit5-native-image-annotation-test/target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ junit5-native-image-annotation-test ---
[INFO] skip non existing resourceDirectory /home/linghengqian/IdeaProjects/junit5-native-image-annotation-test/src/main/resources
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ junit5-native-image-annotation-test ---
[INFO] No sources to compile
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ junit5-native-image-annotation-test ---
[INFO] skip non existing resourceDirectory /home/linghengqian/IdeaProjects/junit5-native-image-annotation-test/src/test/resources
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ junit5-native-image-annotation-test ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 2 source files with javac [debug target 21] to target/test-classes
[INFO] 
[INFO] --- surefire:3.1.2:test (default-test) @ junit5-native-image-annotation-test ---
[WARNING]  Parameter 'systemProperties' is deprecated: Use systemPropertyVariables instead.
[INFO] Surefire report directory: /home/linghengqian/IdeaProjects/junit5-native-image-annotation-test/target/surefire-reports
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.lingh.FunctionLevelTest
[WARNING] Tests run: 1, Failures: 0, Errors: 0, Skipped: 1, Time elapsed: 0.040 s -- in com.lingh.FunctionLevelTest
[INFO] Running com.lingh.ClassLevelTest
[WARNING] Tests run: 1, Failures: 0, Errors: 0, Skipped: 1, Time elapsed: 0 s -- in com.lingh.ClassLevelTest
[INFO] 
[INFO] Results:
[INFO] 
[WARNING] Tests run: 2, Failures: 0, Errors: 0, Skipped: 2
[INFO] 
[INFO] 
[INFO] --- native:0.10.1:test (test-native) @ junit5-native-image-annotation-test ---
[INFO] ====================
[INFO] Initializing project: junit5-native-image-annotation-test
[INFO] ====================
[INFO] Found GraalVM installation from JAVA_HOME variable.
[INFO] Downloaded GraalVM reachability metadata repository from file:/home/linghengqian/.m2/repository/org/graalvm/buildtools/graalvm-reachability-metadata/0.10.1/graalvm-reachability-metadata-0.10.1-repository.zip
[INFO] Executing: /home/linghengqian/.sdkman/candidates/java/21.0.2-graalce/bin/native-image -cp /home/linghengqian/IdeaProjects/junit5-native-image-annotation-test/target/test-classes:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter/5.10.2/junit-jupiter-5.10.2.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.10.2/junit-jupiter-api-5.10.2.jar:/home/linghengqian/.m2/repository/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-commons/1.10.2/junit-platform-commons-1.10.2.jar:/home/linghengqian/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-params/5.10.2/junit-jupiter-params-5.10.2.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.10.2/junit-jupiter-engine-5.10.2.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-engine/1.10.2/junit-platform-engine-1.10.2.jar:/home/linghengqian/.m2/repository/org/graalvm/buildtools/native-maven-plugin/0.10.1/native-maven-plugin-0.10.1.jar:/home/linghengqian/.m2/repository/org/graalvm/buildtools/utils/0.10.1/utils-0.10.1.jar:/home/linghengqian/.m2/repository/org/graalvm/buildtools/graalvm-reachability-metadata/0.10.1/graalvm-reachability-metadata-0.10.1.jar:/home/linghengqian/.m2/repository/org/graalvm/buildtools/junit-platform-native/0.10.1/junit-platform-native-0.10.1.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-console/1.10.0/junit-platform-console-1.10.0.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-reporting/1.10.0/junit-platform-reporting-1.10.0.jar:/home/linghengqian/.m2/repository/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-launcher/1.10.0/junit-platform-launcher-1.10.0.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-engine/1.10.0/junit-platform-engine-1.10.0.jar:/home/linghengqian/.m2/repository/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar:/home/linghengqian/.m2/repository/org/junit/platform/junit-platform-commons/1.10.0/junit-platform-commons-1.10.0.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter/5.10.0/junit-jupiter-5.10.0.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-api/5.10.0/junit-jupiter-api-5.10.0.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-params/5.10.0/junit-jupiter-params-5.10.0.jar:/home/linghengqian/.m2/repository/org/junit/jupiter/junit-jupiter-engine/5.10.0/junit-jupiter-engine-5.10.0.jar --no-fallback -Ob -o /home/linghengqian/IdeaProjects/junit5-native-image-annotation-test/target/native-tests -Djunit.platform.listeners.uid.tracking.output.dir=/home/linghengqian/IdeaProjects/junit5-native-image-annotation-test/target/test-ids --features=org.graalvm.junit.platform.JUnitPlatformFeature org.graalvm.junit.platform.NativeImageJUnitLauncher
========================================================================================================================
GraalVM Native Image: Generating 'native-tests' (executable)...
========================================================================================================================
[1/8] Initializing...                                                                                    (3.4s @ 0.08GB)
 Java version: 21.0.2+13, vendor version: GraalVM CE 21.0.2+13.1
 Graal compiler: optimization level: b, target machine: x86-64-v3
 C compiler: gcc (linux, x86_64, 11.4.0)
 Garbage collector: Serial GC (max heap size: 80% of RAM)
 2 user-specific feature(s):
 - com.oracle.svm.thirdparty.gson.GsonFeature
 - org.graalvm.junit.platform.JUnitPlatformFeature
------------------------------------------------------------------------------------------------------------------------
Build resources:
 - 10.20GB of memory (75.6% of 13.50GB system memory, determined at start)
 - 16 thread(s) (100.0% of 16 available processor(s), determined at start)
[junit-platform-native] Running in 'test listener' mode using files matching pattern [junit-platform-unique-ids*] found in folder [/home/linghengqian/IdeaProjects/junit5-native-image-annotation-test/target/test-ids] and its subfolders.
[2/8] Performing analysis...  [***]                                                                      (9.1s @ 0.56GB)
    6,816 reachable types   (81.8% of    8,329 total)
    9,417 reachable fields  (58.9% of   15,988 total)
   31,085 reachable methods (53.5% of   58,146 total)
    2,194 types,   196 fields, and 1,043 methods registered for reflection
       58 types,    58 fields, and    52 methods registered for JNI access
        4 native libraries: dl, pthread, rt, z
[3/8] Building universe...                                                                               (1.7s @ 0.90GB)
[4/8] Parsing methods...      [*]                                                                        (1.0s @ 0.81GB)
[5/8] Inlining methods...     [***]                                                                      (0.6s @ 0.78GB)
[6/8] Compiling methods...    [**]                                                                       (4.4s @ 0.69GB)
[7/8] Layouting methods...    [**]                                                                       (2.2s @ 1.04GB)
[8/8] Creating image...       [**]                                                                       (2.2s @ 0.63GB)
  13.47MB (42.48%) for code area:    18,814 compilation units
  17.00MB (53.63%) for image heap:  184,390 objects and 152 resources
   1.24MB ( 3.90%) for other data
  31.71MB in total
------------------------------------------------------------------------------------------------------------------------
Top 10 origins of code area:                                Top 10 object types in image heap:
   7.23MB java.base                                            4.10MB byte[] for code metadata
   3.92MB java.xml                                             2.43MB byte[] for java.lang.String
   1.06MB svm.jar (Native Image)                               1.71MB java.lang.String
 226.06kB junit-jupiter-engine-5.10.2.jar                      1.60MB java.lang.Class
 149.55kB junit-platform-launcher-1.10.0.jar                 776.63kB byte[] for embedded resources
 117.03kB java.logging                                       585.75kB com.oracle.svm.core.hub.DynamicHubCompanion
 102.49kB junit-platform-engine-1.10.2.jar                   530.19kB heap alignment
 100.70kB junit-platform-commons-1.10.2.jar                  513.00kB int[][]
  94.83kB junit-platform-reporting-1.10.0.jar                460.98kB byte[] for general heap data
  60.17kB jdk.proxy1                                         359.65kB java.lang.String[]
 304.81kB for 13 more packages                                 4.01MB for 1657 more object types
------------------------------------------------------------------------------------------------------------------------
Recommendations:
 INIT: Adopt '--strict-image-heap' to prepare for the next GraalVM release.
 HEAP: Set max heap for improved and more predictable memory usage.
 CPU:  Enable more CPU features with '-march=native' for improved performance.
------------------------------------------------------------------------------------------------------------------------
                        2.1s (8.0% of total time) in 98 GCs | Peak RSS: 2.12GB | CPU load: 9.35
------------------------------------------------------------------------------------------------------------------------
Produced artifacts:
 /home/linghengqian/IdeaProjects/junit5-native-image-annotation-test/target/native-tests (executable)
========================================================================================================================
Finished generating 'native-tests' in 25.1s.
[INFO] Executing: /home/linghengqian/IdeaProjects/junit5-native-image-annotation-test/target/native-tests --xml-output-dir /home/linghengqian/IdeaProjects/junit5-native-image-annotation-test/target/native-test-reports -Djunit.platform.listeners.uid.tracking.output.dir=/home/linghengqian/IdeaProjects/junit5-native-image-annotation-test/target/test-ids
JUnit Platform on Native Image - report
----------------------------------------

com.lingh.FunctionLevelTest > testOnFunction() SUCCESSFUL


Test run finished after 1 ms
[         2 containers found      ]
[         0 containers skipped    ]
[         2 containers started    ]
[         0 containers aborted    ]
[         2 containers successful ]
[         0 containers failed     ]
[         1 tests found           ]
[         0 tests skipped         ]
[         1 tests started         ]
[         0 tests aborted         ]
[         1 tests successful      ]
[         0 tests failed          ]

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  28.368 s (Wall Clock)
[INFO] Finished at: 2024-03-24T01:24:37+08:00
[INFO] ------------------------------------------------------------------------
```