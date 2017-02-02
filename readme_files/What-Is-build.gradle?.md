###build.gradle
Confusing file: [build.gradle](#buildgradle)

It defines your project!

* `jettyRun.contextPath`:   root of webapp
* `task wrapper(type: Wrapper)`:  tied to a specific version of gradle, lets you run the gradle app without actually having gradle installed
* `repositories`:   Where gradle looks to find the files for external dependencies
* `dependencies`:   Specifies things required for project compilation.
* `compile`:    The dependencies required to compile the production source of the project(`src`).
* `testCompile`:    The dependencies required to compile the test source of the project(`test`). Also includes `compile` dependencies by default.  
* `apply plugin`:   Basically all of the useful things gradle does (like compile Java) come from plugins, these must be applied in order to be used.