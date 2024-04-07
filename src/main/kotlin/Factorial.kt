package org.example

class Factorial {
    fun factorial(n: Int): Int {
        if(n === 1 || n === 0) return n
        return n * factorial(n-1)
    }
}