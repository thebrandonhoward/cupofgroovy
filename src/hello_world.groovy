import groovy.transform.*

def greeting = "Hello, World"

greet(greeting)
typeInfo()
stringInfo()
overloadingInfo()
pogoInfo()
listandrangeInfo()
mapandsetInfo()
closureInfo()

void greet(String greeting) {
    println greeting;
}

void typeInfo() {
    println 3.getClass().getName()
    println 333333.getClass().getName()
    println 33333333333333333.getClass().getName()
    println 3333333333333333333333333333333333333.getClass().getName()
}

void stringInfo() {
    def value = "This is groovy."

    println "1 + 1 = ${1 + 1}"
    println '1 + 1 = ${1 + 1}'
    println '''
        groovy
'''
    println '''
groovy
'''
    println """
Integer to binary string = ${Integer.toBinaryString(2)}
"""
    println value.readLines()
}

void overloadingInfo() {
    def value = "This is groovy."

    println value + "."
    println value - "is "
    println value + '.'
    println value - 'is '

    println value - 'is ' - "is"

    println value * 3;

    println value[0]
    println value[0..3]
    println value[-7..-1]
    println value[-1..-15]
    println value[0..3,5,6,8..-1]

    def reverse = value[-1..-15]
    println reverse
}

void pogoInfo() {
    Automobile automobile = new Automobile()
    automobile.setMake("Cadillac")
    automobile.setModel("Fleetwoeed")

    println automobile.getMake()
    println automobile.getModel()
    println automobile.getProperties()
    println automobile.getClass()
    println automobile.getMetaClass()
    println automobile.getMetaPropertyValues()
    println automobile.toString()

    println "---------------------------------"

    Book book = new Book(author: "B.H", title: "cupofjava")
    println book.getAuthor()
    println book.getTitle()

    book.setAuthor("The B.H")
    book.setTitle("<cupofgroovy>")
    println book.getAuthor()
    println book.getTitle()

    println book.toString()

    println "---------------------------------"

    Hobbies hobbies = new Hobbies("Baseball", "Basketball")
    println hobbies.toString()
}

void listandrangeInfo() {
    Range r = 1..10

    List nums = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2]

    println r
    println r.from
    println r.to
    println r.contains(0)
    println r.contains(10)
    println nums - 1
    println nums - 0 - 1 - 2
    println nums + [7, 8]
    println nums << [7, 8]

    10.downto(7, {println it})
    10.downto(5) {println it}
}

void mapandsetInfo() {
    def map = [a:1, b:2, c:3, d:4]
    def cityMap = ["Dallas":1, "Chicago":2, "Los Angeles":3, "New Orleans":4] as LinkedHashMap

    map.put('e', 5)
    map['f'] = 6

    println map
    println cityMap
    println cityMap.getClass().getName()
    println cityMap.getClass().getCanonicalName()
}

void closureInfo() {
    def cityMap = ["Dallas", "Chicago", "Los Angeles", "New Orleans"] as LinkedList

    cityMap.forEach{city -> println city}
    cityMap.forEach(city -> println city)

    cityMap.each {println it }

    cityMap.eachWithIndex{ String entry, int i ->
        println "cityMap[$i] = $entry"
    }

    cityMap.eachWithIndex{ String entry, int i ->
        println "cityMap[${i}] = ${entry}"
    }
}

class Automobile {
    private String make
    private String model

    void setMake(String make) {
        this.make = make
    }

    void setModel(String model) {
        this.model = model
    }

    String getMake() {
        return this.make
    }

    String getModel() {
        return this.model
    }

    String toString() {
        "{make: $make, model: $model}"
    }
}

class Book {
    String author
    String title

    String toString() {
        "{author: ${author}, title: ${title}}"
    }
}

@ToString(includeNames = true)
@EqualsAndHashCode
@TupleConstructor
class Hobbies {
    String primary
    String secondary
}