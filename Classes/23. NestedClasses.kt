// A nested class cannot access member functions of its outer class
// To access it use inner
class A (val name: String){
    inner class B(){
        fun printName(){
            println("Name")
        }
        fun printName1(){
            println(" $name")
        }
    }
}

fun main() {
    val a = A("Anu")
    a.B().printName()
    a.B().printName1()

}