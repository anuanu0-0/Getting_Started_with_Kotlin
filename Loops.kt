fun main() {
    //For Loop
    val names = arrayOf("Anu","Goku", "Don")

    for(name in names) {
        println(name)
    }

    for(i in names.indices) {
        println(names[i])
    }

    // Range
    println("\nLine 1:")
    for(i in 1..5) {
        print (i)
    }

    println("\nLine 2:")
    if(4 !in 5..10){
        print("Not Present")
    }

    println("\nLine 3:")
    for(i in 1 until 5){
        print(i)
    }

    println("\nLine 4:")
    for(i in 1..5 step 2){
        print(i)
    }

    println("\nLine 5:")
    for(i in 5 downTo 1){
        print(i)
    }

    // wg=hile & do-while loops similar to other lang.
}