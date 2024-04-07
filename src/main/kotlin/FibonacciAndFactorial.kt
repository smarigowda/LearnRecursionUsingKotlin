package org.example

class RecursionProblemSolving {
    fun factorial(n: Int): Int {
        if (n === 1 || n === 0) return n
        return n * factorial(n - 1)
    }

    fun fibOfN(n: Int): Int {
        if (n < 2) return n
        return fibOfN(n - 1) + fibOfN(n - 2)
    }
}

fun main() {
    println("Hello World!")
    val rps = RecursionProblemSolving()
    val num1 = 9
    val result1 = rps.fibOfN(num1)
    println("$num1 st/th Fibonacci is $result1")

    val num2 = 5
    val result2 = rps.factorial(num2)
    println("Factorial of $num2 is $result2")
}