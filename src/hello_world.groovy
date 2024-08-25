import groovy.transform.*

def greeting = "Hello, World"

greet(greeting)
typeInfo()
stringInfo()
overloadingInfo()
pogoInfo()

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