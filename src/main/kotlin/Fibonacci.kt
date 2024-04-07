package org.example
class Fibonacci {
    fun fib(n: Int): Int {
        if (n < 2) return n
        return fib(n - 1) + fib(n - 2)
    }
}

fun main() {
    val obj = Fibonacci()
    val num = 0
    val result = obj.fib(num)
    println("Fibonacci of $num is $result")
}