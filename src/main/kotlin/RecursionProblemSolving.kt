package org.example

class RecursionProblemSolving {
    fun factorial(n: Int): Int {
        if(n === 1 || n === 0) return n
        return n * factorial(n-1)
    }
    fun fibOfN(n: Int): Int {
        if (n < 2) return n
        return fibOfN(n - 1) + fibOfN(n - 2)
    }
}