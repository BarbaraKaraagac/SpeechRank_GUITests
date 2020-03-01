# SpeechRank_GUITests
This is a repository of GUI Tests for the https://github.com/NetworkedCoders/speech-rank project

# Before

Get the project:

`https://github.com/NetworkedCoders/speech-rank` 

run as per the insturuction in it's readme.

If you want to run the tests multiple times, please restart the gradle process (press ctrl + c in the respective terminal window and run the gradlew command again).

# Getting things run

After cloning the repository from github, IntelliJ might act up a little. Might happen, that JDK and Maven dependencies will not be added automatically. To solve it go to:

` File -> Project Structure`

..and choose the SDK. This project is based on Java 8, so it should be:

`java version "1.8.0_144"`

Regarding maven dependecies, you'll be prompted by IntelliJ with a message:

'Non-managed pom.xml file found'

Simply choose:

`Add as Maven Project` 

option.

# Execution of tests
Tests can be run either directly from IntelliJ:

`resources -> all_tests_suite.xml ->Run`

or via console (Windows):

`mvn clean test`

# Reports-Allure
Allure reports can be generated after running

`mvn clean test`

via

`mvn allure:report`

The report will be generated in your project file in target\site\allure-maven-plugin location as an idex.html file.``
