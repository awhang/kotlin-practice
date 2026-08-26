package com.practice.backend.problems.easy

/**
 * Problem: Two Sum
 * 
 * Given an array of integers nums and an integer target, return the indices of the two numbers 
 * that add up to target. You may assume that each input has exactly one solution, and you 
 * may not use the same element twice.
 * 
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0, 1]
 * Explanation: nums[0] + nums[1] == 9, return [0, 1]
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
object TwoSum {
    
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        
        for ((index, num) in nums.withIndex()) {
            val complement = target - num
            if (complement in map) {
                return intArrayOf(map[complement]!!, index)
            }
            map[num] = index
        }
        
        return intArrayOf()
    }
}
