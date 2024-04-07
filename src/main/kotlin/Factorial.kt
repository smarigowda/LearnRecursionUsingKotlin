package org.example
class Factorial {
    fun fact(n: Int): Int {
        if (n === 1 || n === 0) return n
        return n * fact(n - 1)
    }
}

fun main() {
    val obj = Factorial()
    val num = 5
    val result = obj.fact(num)
    println(result)
}