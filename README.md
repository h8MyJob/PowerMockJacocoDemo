# (See Project wiki section for detailed information)

- This project demonstrates the Powermock/Jacoco issue and provides a gradle android solution. 

# Problem
The combination of PowerMock and Jacoco can result in fully covered classes being reported as 0% coverage. It’s a well-known issue and more can be found at the powermock github https://github.com/powermock/powermock/wiki/Code-coverage-with-JaCoCo

# Solution
The project is setup to reproduce the issue and to apply the fix, thus, creating a before and after effect. The code is based off of a project from the Powermock team to demonstrate offline intrumentation with Maven (https://github.com/powermock/powermock-examples-maven/tree/master/jacoco-offline). The difference is that this project adapted to Android and gradle.

# Usage

To reproduce
- Ensure that build.gradle is referencing jacoco.gradle
- In command line run: gradle clean & gradle jacocoTestReport
- Coverage of Configuration.java and Lamda.java will be set as 0% in jacoco coverage report

To Fix
- Ensure that build.gradle is referencing jacoco_offline.gradle
- In command line run: gradle clean & gradle createOfflineInstrTestCoverageReport & gradle jacocoTestReport
- Coverage of Configuration.java and Lamda.java will be different than 0% in jacoco coverage report
