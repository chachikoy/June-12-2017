package Exercises

/**
 * Created by Charlotte on 6/12/2017.
 */

String s =  'this is a sentence'
String name = 'Charlotte'

//this method is from the java library, to compute the number of the characters of a String
println "Using .length of JAVA = ${s.length()}"
//this method is from the groovy, to compute the number of the characters of a String. Has the same function with .length
println "Using .size of Groovy = ${s.size()}"
// assert method is from the spock framework, to test the values if it's equal,
// but once it is failed it will return lot of information to prove how it failed
assert s.length() == s.size()
// this operator or range is to get the word wanted using the indices of each character in a string
println "Using [0..3]/range of Groovy = ${s[0..3]}"
//the ranging can also use to revers the String or the specific word wanted
println "Using [3..0]/range of Groovy to reverse = ${s[3..0]}"
println "Using range to revese the string = ${s[-1..0]}"
//Groovy has provided reverse method to reverse the string
println "Using reverse method to reverse the string = ${s.reverse()}"
//concatination still work in Groovy
println 'Using the + operator for concatination = ' +  s + ' with more words'
//even the s string concatinated with other string,
// assert method prove that it doesn't affect the value of initialized string even it is concatinated by another string
assert s == 'this is a sentence'
// the minus operator is not just to reduce the value of a number
// but it can use to remove the specific part you want to remove in string.
println 'Using minus operator ' + s - 'is' - 'is'
//These are the comparison of the interpolation of the string
println "Hello, ${name}"
println "Hello, $name"
println 'Hello, $name'


