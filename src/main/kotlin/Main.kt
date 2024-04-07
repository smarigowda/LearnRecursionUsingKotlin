package org.example
fun main() {
    println("Hello World!")
    val fib = Fibonacci()
    val num = 9
    val result = fib.fibOfN(num)
    println("Fibonacci of $num is $result")
}