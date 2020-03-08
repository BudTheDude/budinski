package homework1

fun countVocals(str: String) = str.count { it in "aeiouAEIOU" }

fun main(){
    println(countVocals("HELLO Kotlin"))
}