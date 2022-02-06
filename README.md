# README #

This project is a simple project created to demonstrate how to ### run junit5 suites with maven. ### It also has information to create different profiles and run the same using Maven command.

### What is this repository for? ###

* Quick summary
* Version
* [Learn Markdown](https://bitbucket.org/tutorials/markdowndemo)

### How do I get set up? ###
* Deployment instructions
Use normal git commands to clone

* How to run tests
To run partial tests : mvn clean test -PpartialSuite -DprofileIdEnabled=true
To run full suite : mvn clean test -PfullSuite -DprofileIdEnabled=true

### Contribution guidelines ###

* Writing tests
* Code review
* Other guidelines

### Who do I talk to? ###

* Repo owner or admin
* Other community or team contact
