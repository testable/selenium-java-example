Examples showing how to utilize [testable-selenium-java](https://github.com/testable/testable-selenium-java) and how to run tests on Testable.
This includes via main class, JUnit, and TestNG and built via either Maven or Gradle.

Examples:

* `MainSampleTest`: Main class that loads Google and takes a screenshot.
* `JUnitSampleTest`: JUnit test that loads Google and takes a screenshot.
* `TestNGSampleTest`: TestNG test that loads Google and takes a screenshot.

There a variety of ways to run this on Testable:

* Upload a jar and specify the main class or test classes
* Upload an executable jar that runs your main class
* Upload this project in a zip file. Choose Gradle or Maven as the build tool and specify the right goals:
    * `Gradle`: `build test` (for JUnit/TestNG) or `build run` (for main class)
    * `Maven`: `test` (for JUnit/TestNG) or `compile exec:exec` (for main class)
