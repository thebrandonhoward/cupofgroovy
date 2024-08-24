def greeting = "Hello, World"

greet(greeting)
info()

void greet(String greeting) {
    println greeting;
}

void info() {
    println 3.getClass().getName()
    println 333333.getClass().getName()
    println 33333333333333333.getClass().getName()
    println 3333333333333333333333333333333333333.getClass().getName()
}