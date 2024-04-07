package org.example

class PrintReverse {
    fun print(value: Int) {
        if(value == 0) return
        print(value - 1)
        println(value)
    }
}

fun main() {
    val obj = PrintReverse()
    obj.print(10)
}