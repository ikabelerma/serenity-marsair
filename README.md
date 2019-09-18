# serenity-marsair

## Prerequisites
1. JDK
```shell script
brew tap AdoptOpenJDK/openjdk
brew cask install adoptopenjdk11
```

2. Chromedriver
```shell script
brew cask install chromedriver
```
3. Google Chrome

## To run Cucumber test
```shell script
./gradlew clean test aggregate 
```