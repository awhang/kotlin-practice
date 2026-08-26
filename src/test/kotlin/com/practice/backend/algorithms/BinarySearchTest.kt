package com.practice.backend.algorithms

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class BinarySearchTest : FunSpec({
    
    context("BinarySearch.search") {
        test("should find element in the middle") {
            val arr = intArrayOf(1, 3, 5, 7, 9)
            val result = BinarySearch.search(arr, 5)
            result shouldBe 2
        }
        
        test("should find element at the start") {
            val arr = intArrayOf(1, 3, 5, 7, 9)
            val result = BinarySearch.search(arr, 1)
            result shouldBe 0
        }
        
        test("should find element at the end") {
            val arr = intArrayOf(1, 3, 5, 7, 9)
            val result = BinarySearch.search(arr, 9)
            result shouldBe 4
        }
        
        test("should return -1 when element not found") {
            val arr = intArrayOf(1, 3, 5, 7, 9)
            val result = BinarySearch.search(arr, 6)
            result shouldBe -1
        }
        
        test("should handle single element array") {
            val arr = intArrayOf(5)
            BinarySearch.search(arr, 5) shouldBe 0
            BinarySearch.search(arr, 3) shouldBe -1
        }
    }
})
