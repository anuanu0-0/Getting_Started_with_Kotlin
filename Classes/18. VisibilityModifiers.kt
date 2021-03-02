// Default pulblic
private fun outsideFunction() {
    println("This is an outsideFunction")
}

// Defaut public
var outsideProperty : String = "outside"

class Teacher{
    private var onLeave = false
    protected var parkingSlot = 1
    internal val school = "Kotlin School"

    // Default public
    val name = "Anu"
    fun isAvailable() = !onLeave
}


fun main(args:Array<String>) {
    println(outsideFunction())
    val teacher = Teacher()

    // Private member can be accessed inside the same class
  //  println("Teacher is on leave: ${teacher.onLeave}")   // Error!!

    // Protected members can be accessed inside the same class or subclass
  //  println("Teacher has parkinh slot: ${teacher.parkingSlot}")  // Error!!

    println("The school is: ${teacher.school}")
    println("Teacher is available: ${teacher.isAvailable()}")

}