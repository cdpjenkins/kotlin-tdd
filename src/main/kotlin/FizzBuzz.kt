package org.example

fun main() {
    println("Hello World!")
}

fun fizzBuzz(i: Int): String {
    if (i <= 0) throw IllegalArgumentException("Parameter must be greater than 0")
    if (i % 3 == 0 && i % 5 == 0) return "fizzbuzz"
    if (i % 5 == 0) return "buzz"
    if (i % 3 == 0) return "fizz"
    return i.toString()
}
