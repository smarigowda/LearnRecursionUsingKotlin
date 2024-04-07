package org.example

class BinarySearch {
    fun search(list: ArrayList<Int>, startIndex: Int, endIndex: Int, target: Int): Int {
        if (startIndex > endIndex) return -1
        // because we are not mutating the Array, we need to ass startIndex to get the midIndex
        val midIndex = startIndex + (endIndex - startIndex) / 2
        val midValue = list[midIndex]
        if (target === midValue) return midIndex
        if (target > midValue) {
            return search(list, midIndex + 1, endIndex, target)
        } else {
            return search(list, startIndex, midIndex - 1, target)
        }
    }
}

fun main() {
    val bs = BinarySearch()
    val sortedArray = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val target = 8
    val result3 = bs.search(sortedArray, 0, sortedArray.size - 1, target)
    println("The target $target is at index $result3")
}