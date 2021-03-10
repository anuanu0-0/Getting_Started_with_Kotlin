
open class Person2(val name: String)
class Student2(name:String) : Person2(name)

fun main() {
    val names: List<String> = listOf("John", "Sarah", "Anu")
    val ranks: List<Int> = listOf(3,4,5)

    val student: Student2 = Student2("Anu")
    val person: Person2 = student

    val students: MutableList<Student2> = mutableListOf(Student2("Anu"), Student2("Sarah"))

    // Error!! Generics are invariant
    //val persons: MutableList<Person2> = students

}