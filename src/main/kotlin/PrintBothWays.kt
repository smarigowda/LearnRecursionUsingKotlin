package org.example

class PrintBothWays {
    fun print(value: Int) {
        if (value == 0) {
            println("this is the end of recursion... returning...")
            return
        }
        println(value)
        print(value - 1)
        println(value)
    }
}

fun main() {
    val obj = PrintBothWays()
    // Print both ways, from N to 1 (calling println before recursion)
    // and from 1 to N (calling println after recursion)
    val N = 10
    obj.print(N)
}