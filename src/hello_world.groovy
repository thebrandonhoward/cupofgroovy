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
}