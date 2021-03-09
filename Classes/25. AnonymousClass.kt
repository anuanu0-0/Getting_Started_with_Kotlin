open class P {
    fun walk() {
        println("Person is walking")
    }
    fun sleep() {
        println("Person is sleeping")
    }
    open fun talk(){
        println("Person is talking")
    }
}

fun main() {
    startTalking(object: P() {
        override fun talk() {
            println("I am talking")
        }
    })
}

fun startTalking(p: P) {
    p.talk()
}