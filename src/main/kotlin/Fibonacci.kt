package org.example

class Fibonacci {
    fun fibOfN(n: Int): Int {
        if (n < 2) return n
        return fibOfN(n - 1) + fibOfN(n - 2)
    }
}