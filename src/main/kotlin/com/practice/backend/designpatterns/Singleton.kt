package com.practice.backend.designpatterns

/**
 * Singleton Pattern - Thread-safe implementation
 * 
 * Ensures a class has only one instance and provides a global point of access.
 */
object DatabaseConnection {
    private val connectionPool = mutableListOf<String>()
    
    init {
        // Initialize connection pool
        repeat(5) { connectionPool.add("connection-$it") }
    }
    
    fun getConnection(): String? = connectionPool.firstOrNull()
    
    fun releaseConnection(connection: String) {
        connectionPool.add(connection)
    }
}
