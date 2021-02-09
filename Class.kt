// var <propertyName>[:<PropertyType>] [=<property_initializer>]
// [<getter>]
// [<setter>]

class Student {
    val school:String = "Android School"
    var age:Int = 5

    val isTeen:Boolean
        get() = age > 12

    var name: String? = null
        get() = field ?: "Unknown"
        set(value) {
            if(value!=null) field = value
        }
}

fun main() {
    val student: Student = Student()

    println("1. Student is a teenager: ${student.isTeen}")
    student.age = 14
    println("2. Student is a teenager: ${student.isTeen}")
    println("3. Student name is : ${student.name}")
    student.name = "John"
    println("4. Student name is: ${student.name}")


}