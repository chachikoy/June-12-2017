package Exercises

/**
 * Created by Charlotte on 6/12/2017.
 */
class GroovyExercisess{
    static void main(String[] args){

        ClosureFilter()
    }

    static void SortingStrings(){
        def stringsList = ['watermelon', 'apple', 'grapes', 'pineapple', 'lemonade']
        println "Printing string list = $stringsList"
        println "Sorted Alphabetically = ${stringsList.sort()}"
        println "Sorted them by length ${stringsList*.size()}"
        println "Sorted by length in descending order = ${stringsList.sort {-it.size()}}"
        println "Sorted by length, reverse = ${stringsList.reverse()}"

    }
    static void ProcessingListOfNumbers(){
        def nums = [5, 51, 8, 23, 11, 20, 16]
        println "Printing number list = $nums"
        println "Sum of all the elements = ${nums.sum()}"
        println "double each # = ${nums.multiply(2)}"
        println "double each # and add together = ${nums.multiply(2).sum()}"
        println "double each # and add together = ${nums.multiply(2).sum() / 7}"
    }

    static void ReadingWebPage(){

    }

    static void ClosureFilter(){
        def nums = [-1, 51, 8, -2, 11, -8, 16]
         println "${nums.findAll {it > 0 }}"

    }

    static void MultiLineStrings(){
        def multiLineString = """Hello, how are you today? 
                                 I hope that you are doing good."""

        println "${multiLineString.findAll("[aeiou]")}"
    }
}


