# Kotlin Practice - Backend & Interview Prep

A practice repository for sharpening Kotlin skills through toy problems, algorithms, and design patterns relevant to enterprise backend systems.

## Structure

```
src/main/kotlin/com/practice/backend/
├── algorithms/          # Common algorithms and patterns
├── datastructures/      # Implementations of data structures
├── designpatterns/      # Enterprise design patterns
└── problems/            # Toy problems organized by category
    ├── easy/
    ├── medium/
    └── hard/

src/test/kotlin/com/practice/backend/
└── [Mirror of main structure for tests]
```

## Practice Areas

### Algorithms
- Sorting and searching
- Graph algorithms
- Dynamic programming
- Greedy algorithms
- String manipulation

### Data Structures
- Lists, Sets, Maps
- Trees (BST, AVL, etc.)
- Graphs
- Heaps
- Tries

### Design Patterns
- Creational (Singleton, Factory, Builder)
- Structural (Adapter, Decorator, Proxy)
- Behavioral (Observer, Strategy, Command)
- Architectural (MVC, Repository, etc.)

### Problems
Organized by difficulty level with focus on:
- Backend system design
- API design
- Database optimization
- Concurrency and threading
- Error handling and resilience

## Getting Started

1. **Build**: `./gradlew build`
2. **Run tests**: `./gradlew test`
3. **Run specific test**: `./gradlew test --tests "com.practice.backend.*YourTest"`

## Dependencies

- **Kotlin 1.9.21**
- **JUnit 5** for testing
- **Kotest** for assertions
- **Mockito** for mocking
- **SLF4J + Logback** for logging

## Tips for Code Reviews

When reviewing code in this repo:
1. Focus on Kotlin idioms and best practices
2. Check for proper null safety
3. Verify concurrency handling
4. Look for clean abstractions and SOLID principles
5. Ensure comprehensive test coverage
