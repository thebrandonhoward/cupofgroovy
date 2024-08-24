def greeting = "Hello, World"

greet(greeting)
typeInfo()
stringInfo()
overloadingInfo()

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
    println "1 + 1 = ${1 + 1}"
    println '1 + 1 = ${1 + 1}'
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