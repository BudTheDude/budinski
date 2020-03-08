package homework1


val data = listOf(4, 6, 34, 9, 2, 4, 7)

fun isPrime(nr: Int): Boolean {

    return (2..nr / 2).none { nr % it == 0 }
}

fun listOperations() {

    println("A. Print the list")
    data.forEach { print("$it ") }
    println()

    println("B. Print the list in reverse order")
    data.reversed().forEach { print("$it ") }
    println()

    println("C. Print the list with no duplicates")
    data.distinct().forEach { print("$it ") }
    println()

    println("D. Print first 3 elements of the list")
    data.take(3).forEach { print("$it ") }
    println()

    println("E. Print if all elements are positive")
    if (data.filter { it < 0 }.isNotEmpty()) print("Not all positive") else print("All positive")
    println()

    println("F. Print square root of all elements in the list")
    data.forEach { print("${kotlin.math.sqrt(it.toDouble())} ") }
    println()

    println("G. Print even numbers only")
    data.filter { it % 2 == 0 }.forEach { print("$it ") }
    println()

    println("H. Print index (position in the list) of odd numbers")
    data.mapIndexedNotNull { index, it -> if (it % 2 != 0) index else null }
        .forEach { print("$it ") }
    println()

    println("I. Print all prime number")
    data.filter { isPrime(it) }.forEach { print("$it ") }
    println()

    println("J. Print last prime number")
    print(data.last { isPrime(it) })
    println()

}

fun main() {
    listOperations()
}

