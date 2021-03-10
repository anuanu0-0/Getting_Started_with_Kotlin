open class Person1(val name:String)

class Student1(name:String) : Person1(name)

fun main() {
    // type
    val age:Int = 24
    val rollNumber:Int? = 4

    // subtype
    val student:Student1 = Student1("Anu")
    val person1:Person1 = Student1("king")
    val person2:Person1 = student


    // corresponding non nullable type are subtype of nullable type
    val x:String = "Anu"
    val y:String? = x
}