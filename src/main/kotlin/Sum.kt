package org.example

class Sum {
    fun sum(n: Int): Int {
        if(n == 1) return 1
        if(n == 0) return 0
        return n + sum(n - 1)
    }
}

fun main() {
    val obj = Sum()
    val num = 10
    val result = obj.sum(num)
    println("Sum of numbers from 0 to $num is $result")
}