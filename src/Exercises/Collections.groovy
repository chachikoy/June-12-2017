package Exercises

/**
 * Created by Charlotte on 6/12/2017.
 */

class CollectionsTopic{
    static void main(String[] args){

//        Ranges()
 //       Lists()
        Maps()
    }

    static void Ranges(){

//initilized a variable that has a value using a range of numbers
        def nums = -3..3
        println nums
// assert is to check or test the value of the variable
        assert nums.contains(-3)
        assert nums.contains(3)
        assert nums.from == -3
        assert nums.to == 3
//initializing another variable, with the use of range and conditional operators
        def num2 = -3..<3
        println num2
//the ranging can use in the date also
        Date now = new Date()
        Date then = now + 5
        (now..then).each {
            println it.format('MMM dd, yyyy')
        }

    }

    static void Lists(){
        def strings = ['Red Sox', 'Yankees']
        assert strings.class == java.util.ArrayList
        // Orioles & Blue Jays added to a strings by using concatination or plus operator
        println strings + ['Orioles', 'Blue Jays']
        //it is a testing or checking the equality of strings variable with the concatinated values
        assert strings + ['Orioles', 'Blue Jays'] ==
                ['Red Sox', 'Yankees', 'Orioles', 'Blue Jays']
        //this simply test, if the original strings initiated was not affected by the concatinated values
        //simply, by using concatination the originial lists will not affect
        assert strings == ['Red Sox', 'Yankees']
        println strings

        //In this part, it uses the left shift operator,
        // where the values added by using the left shift operator will effect the original vlists
        strings << ['Orioles', 'Blue Jays']
        println strings
        //NOTE: the list added will include a box bracket [] to identify the added lists
        assert strings == ['Red Sox', 'Yankees', ['Orioles', 'Blue Jays']]

        //By using, minus operator, it is not just used in numbers only but also in string,
        // specially in List w/o using the indices but specifying the element
        println strings - 'Yankees'
        assert strings - 'Yankees' ==   ['Red Sox', ['Orioles', 'Blue Jays']]
        // -->0 1 2 ........... -3 -2 -1 <--
        // [(-3)<- Red Sox (->0), (-2)<- Yankees (->1), (-1)<- [Orioles, Blue Jays] (->2)]
        println "Strings [0..2] = ${strings[0..2]}"
        println "Strings [-3..-1] = ${strings[-3..-1]}"
        println "Strings [1..-1] = ${strings[1..-1]}"
        println "Strings [0,2] = ${strings[0, 2]}"

        //using flatten method
        //flatten methos is to remove the bracket,
        // and make the list as a single list without having another group of list inside onw list
        strings = strings.flatten()
        println("In using Flatten = $strings")
        assert strings == ['Red Sox', 'Yankees', 'Orioles', 'Blue Jays']
        def nums = [3, [1, [4, [1, 5], 9], 2], 6]
        println "withot using Flatten = $nums"
        println "With using Flatten ${nums.flatten()}"
        assert nums.flatten() == [3, 1, 4, 1, 5, 9, 2, 6]

        //spread dot is a short cut for collect to invoke a method on EACH element
        println "Using spread Dot operator = ${strings*.size()}"
        assert strings*.size() == [7, 7, 7, 9]
        //using collect (closure) to get the first 3 chars. of each element
        println "Collect the first 3 characters of EACH element = ${strings.collect {it[0..2].toLowerCase()}}"
        assert strings.collect {it[0..2].toLowerCase()} == ['red', 'yan', 'ori', 'blu']

        //in using join
        nums = nums.flatten()
        println "Using join = ${nums.join(',')}"
        println "Using join = ${nums.join('***')}"
        assert nums.join(',') == '3,1,4,1,5,9,2,6'
        assert nums.join('***') == '3***1***4***1***5***9***2***6'
    }

    static void Maps(){
        def map = [:]
        map.k1 = 'v1'
        map['k2'] = 'v2'
        map.put('k3', 'v3')

        assert map.k1 == 'v1'
        assert map['k2'] == 'v2'
        assert map.get('k3') == 'v3'

        println map.keySet()
        assert map.keySet() == ['k1', 'k2', 'k3'] as Set
        println map.entrySet()
        println map.values()
        assert map.values() as List == ['v1', 'v2', 'v3']

        println "Size of keySet = ${map.keySet().size()}"
        println "Size of entrySet = ${map.entrySet().size()}"
        println "Size of map = ${map.size()}"

        assert map.keySet().size() == 3
        assert map.entrySet().size() == 3
        assert map.size() == 3

        println "Map using collect ${map.collect{ k,v -> "$k=$v" }.join(' & ')}"
        assert map.collect { k,v -> "$k=$v" }.join('&') == 'k1=v1&k2=v2&k3=v3'

/*        def info = [name : 'allan', age : 21,
                    name : 'mark', age : 30,
                    name : 'cha', age : 18,
                    name : 'kaps', age : 25]

        info = info.findAll{it.value <= 18}.collect{it.value}.join(',')
        println info*/
    }
}

