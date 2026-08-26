package com.practice.backend.datastructures

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class StackTest : FunSpec({
    
    context("Stack") {
        test("should push and pop elements") {
            val stack = Stack<Int>()
            stack.push(1)
            stack.push(2)
            stack.push(3)
            
            stack.pop() shouldBe 3
            stack.pop() shouldBe 2
            stack.pop() shouldBe 1
        }
        
        test("should return null when popping empty stack") {
            val stack = Stack<Int>()
            stack.pop() shouldBe null
        }
        
        test("should peek without removing") {
            val stack = Stack<String>()
            stack.push("hello")
            
            stack.peek() shouldBe "hello"
            stack.peek() shouldBe "hello"
            stack.size() shouldBe 1
        }
        
        test("should report correct size") {
            val stack = Stack<Int>()
            stack.isEmpty() shouldBe true
            
            stack.push(1)
            stack.size() shouldBe 1
            stack.isEmpty() shouldBe false
            
            stack.push(2)
            stack.size() shouldBe 2
        }
    }
})
