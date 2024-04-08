package org.example
class SumOfDigits {
    fun sum(num: Int): Int {
        if(num == 0) return 0
        return num % 10 + sum (num/10)
    }
}
fun main() {
    val obj = SumOfDigits()
    val num = 1273
    val result = obj.sum(num)
    print("Sum of all digits in $num = $result")
}