// Data class : Only properties in the constructor
data class Women(val name:String, var section:String) {
    var age:Int = 8
}

fun main() {
    val women = Women("Anu", "A")
    women.age = 20
    val women1 = Women("Anu", "A")

    // Functions of Data class
    // Equals
    println("Line 1: equals() : ${women.equals(women1)}")
    // toString
    println("Line 2: toString() : ${women1.toString()}")
    // Copy
    val women2 = women.copy(name="Mia")
    println("Line 3: copy() : ${women2.toString()}" )
    // Destructing
    val (name, section) = women
    println("Line 4: Destructuring : $name is in section $section")

}