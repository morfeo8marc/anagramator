# Anagram Poetry[Trains Exercise]
It's a java exercise.

## Technologies used
* Java 8.
* Spring.
* Spring boot.

## Usage
Just clone the repo to your machine and yo can run the exercise in two ways:
1. If you have maven, just go to the root of the project and type: 
```
mvn spring-boot:run
```
2. If you don't have maven download a builded jar the exercise in the [githubs release](https://github.com/morfeo8marc/anagramator/releases) section. Once dowloaded just type:
```
java -jar anagramator.jar
```
## Building a release
In order to build an executable binary of the exercise just go to the project's root directory and type:
```
mvn package
cd target
java -jar anagramator.jar
```
## Validating the results
To validate the result execute the program and look at he output
```
abc
bca
cab?

abc
bca
cab?

abc
bca
cab?

true
```

## The Problem to model
As specified in Wikipedia, an anagram is a type of word play, the result of rearranging the letters of a word or phrase to produce a new word or phrase, using all the original letters exactly once; e.g., orchestra = carthorse, A decimal point = I'm a dot in place.

An anagramic poem is a poem where each line or each verse is an anagram of all other lines or verses in the poem. Please prepare Java code that, given a poem, returns a Boolean value indicating whether or not the poem is an anagramic poem.

You will return: 
* true if all the lines are anagrammatic with each other
* false if any of the lines is not anagrammatic with any of the rest of them