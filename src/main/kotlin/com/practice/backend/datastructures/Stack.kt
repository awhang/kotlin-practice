package com.practice.backend.datastructures

/**
 * Stack Implementation using ArrayList
 * 
 * LIFO (Last-In-First-Out) data structure
 */
class Stack<T> {
    private val items = mutableListOf<T>()
    
    fun push(element: T) {
        items.add(element)
    }
    
    fun pop(): T? {
        return if (items.isEmpty()) null else items.removeAt(items.size - 1)
    }
    
    fun peek(): T? {
        return items.lastOrNull()
    }
    
    fun isEmpty(): Boolean = items.isEmpty()
    
    fun size(): Int = items.size
}
