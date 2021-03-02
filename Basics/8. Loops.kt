
fun main(args:Array<String>) {
    // For loop
    var names = arrayOf("Anu", "Tom", "Joe")

    //1.
    for(name in names)
        print("$name ")
    println()
    //2.
    for(i in names.indices)
            print("${names[i]} ")
    println()
    // Ranges
    for(i in 1..5)
        print("$i ")
    println()
    if(4 !in 5..10)
        println("Not Present")

    for(i in 1 until 5)
        print("$i ")
    println()
    for(i in 1..5 step 2)
        print("$i ")
    println()
    for(i in 5 downTo 1)
        print("$i ")
    println()
}