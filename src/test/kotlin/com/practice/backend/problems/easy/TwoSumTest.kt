package com.practice.backend.problems.easy

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.collections.shouldContainAll
import io.kotest.matchers.shouldBe

class TwoSumTest : FunSpec({
    
    context("TwoSum.twoSum") {
        test("should find two sum in basic case") {
            val nums = intArrayOf(2, 7, 11, 15)
            val result = TwoSum.twoSum(nums, 9)
            result.toList() shouldContainAll listOf(0, 1)
        }
        
        test("should find two sum with negative numbers") {
            val nums = intArrayOf(3, 2, 4)
            val result = TwoSum.twoSum(nums, 6)
            result.toList() shouldContainAll listOf(1, 2)
        }
        
        test("should handle two element array") {
            val nums = intArrayOf(5, 5)
            val result = TwoSum.twoSum(nums, 10)
            result.toList() shouldContainAll listOf(0, 1)
        }
    }
})
