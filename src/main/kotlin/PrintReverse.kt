package org.example

class PrintReverse {
    fun print(value: Int) {
        if (value == 0) return
        print(value - 1)
        println(value)
    }
}

fun main() {
    val obj = PrintReverse()
    // Print in reverse from 1 to N
    val N = 10
    obj.print(N)
}