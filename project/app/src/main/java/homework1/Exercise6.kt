package homework1

data class Student(val name: String, val address: String, val grade: Int)

val students = listOf(
    Student("John", "Boston", 6), Student("Jacob", "Baltimore", 2),
    Student("Edward", "New York", 7), Student("William", "Providence", 6),
    Student("Alice", "Philadelphia", 4), Student("Robert", "Boston", 7),
    Student("Richard", "Boston", 10), Student("Steven", "New York", 3)
)

fun printOperations() {

    println("A. Print students")
    students.forEach { println(it) }

    println("B. Print students in alphabetical order")
    students.sortedBy { it.name }.forEach { println(it) }

    println("C. Print student names only in alphabetical order")
    students.sortedBy { it.name }.forEach { println("${it.name} ") }

    println("D. Print students sorted by grade and name")
    students.sortedWith(compareBy({ it.grade }, { it.name }))
        .forEach { println("$it ") }

    println("E. Print students grouped by their address")
    students.groupBy { it.address }.forEach { println("$it") }
}

fun main() {
    printOperations()
}