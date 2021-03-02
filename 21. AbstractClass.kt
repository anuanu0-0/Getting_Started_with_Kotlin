// 1
open class Animal(val name:String) {
    open fun count(){
        println("Animal count")
    }
    fun eat(){
        // random function
    }
}

// 2. Making above class abstract
abstract class animal(val name:String) {
    abstract fun count()
    fun eat(){
        // random function
    }
}

// 1
class Bird(name:String, val santuary:String):animal(name) {
    override fun count() {
        println("12 Species of birds")
    }
}
// 2
class Mammal(name:String, val santuary: String):animal(name) {
    override fun count() {
        println("50 species of mammals")
    }
}

fun main(){
    val bird = Bird("Peacock", "XYZ")
    bird.count()

    val mammal = Mammal("Whale", "ABC")
    mammal.count()
}