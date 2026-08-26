package com.practice.backend.algorithms

/**
 * Binary Search Algorithm
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
object BinarySearch {
    
    /**
     * Searches for a target value in a sorted array.
     * 
     * @param arr sorted array to search
     * @param target value to find
     * @return index of target if found, -1 otherwise
     */
    fun search(arr: IntArray, target: Int): Int {
        var left = 0
        var right = arr.size - 1
        
        while (left <= right) {
            val mid = left + (right - left) / 2
            when {
                arr[mid] == target -> return mid
                arr[mid] < target -> left = mid + 1
                else -> right = mid - 1
            }
        }
        
        return -1
    }
}
