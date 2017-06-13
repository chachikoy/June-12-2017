package Exercises

/**
 * Created by Charlotte on 6/12/2017.
 */
class GroovyExercisess{
    static void main(String[] args){

 //ClosureFilter()
      //MultiLineStrings()
//PaddedBinaryOutput()
        SortingStrings()
    }

    static void SortingStrings(){
        //declration of list variable
        def stringsList = ['watermelon', 'apple', 'grapes', 'pineapple', 'lemonade']

        println "Printing string list = $stringsList"
//in using sort() method the arrangement of the list will be arrange alphabetically
// if you add false as a parameter of .sort(false), the arrangement will not take effect once the list called again

        println "Sorted Alphabetically = ${stringsList.sort()}"
// since there's no false parameter in the sort() method. The list still is in alphabetical arrangement
        println "Sorted them by length ${stringsList*.size()}"

//the purpose of the -it.size is to arrange the list of string in descending or from highest size to shortest
        println "Sorted by length in descending order = ${stringsList.sort {-it.size()}}"

//reverse() method is self explanatory which arranging the list oppositely
        println "Sorted by length, reverse = ${stringsList.reverse()}"

    }
    static void ProcessingListOfNumbers(){

//Initializing list nums variable
        def nums = [5, 51, 8, 23, 11, 20, 16]

        println "Printing number list = $nums"
//using sum() method, it will generate the total of all the elements
        println "Sum of all the elements = ${nums.sum()}"
// muliply() method is one of the operator overloading that the groovy offere
        println "double each # = ${nums.multiply(2)}"

        println "double each # and add together = ${nums.multiply(2).sum()}"
//getting the average of the list
        println "double each # and add together = ${(nums.multiply(2).sum() / 14)}"
    }

    static void ReadingWebPage(){
        String webURL = "https://facebook.com"
// in Using toURL() method, the compiler will know that the given string or value in text is a URL
        def text = { URL -> URL.toURL().getText()}
//Printing source code of the home page of facebook.com
        println text(webURL)
    }

    static void ClosureFilter(){
        // declatation of list variable
// the default class of list in Groovy is ArrayList
        def nums = [-1, 51, 8, -2, 11, -8, 16]

//using findAll{closure}, can filter the list by having a condition on it
//it is a default name of any arguments in using closure
        println "${nums.findAll {it > 0 }}"
    }

    static void MultiLineStrings(){

//initializing multiLineString List variable that contains multiple line of strings
        def multiLineString = """Hello, how are you today? 
                                 I hope that you are doing good."""
//by using findAll(pattern),
// the function of this is to find all the vowels in the declared multiLineString varibale
// and put the collected vowels in a list
// the size() method is to get the total number of element in the list of vowels
        println multiLineString.findAll('[aeiou]').size()


    }

    static void PaddedBinaryOutput(){

//for-in loop with the ranging condition is to generate the numbers from 0 to 15
        for (number in 0..15)
            println number + ' = ' +Integer.toBinaryString(number)
// the Integer.toBinaryString() method is from the java.lang.String
// the purpose of it is to convert the Integer into binary
    }
}


