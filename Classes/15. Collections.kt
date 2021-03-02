
fun main(args:Array<String>) {
    // 1A. Immutable List
    val names = listOf("Anu", "Goku", "Tom")
    println("1.Size of list: ${names.size}")
    println("2. Second item: ${names.get(1)} && using index operator ${names[1]}")
    println("3. Find index of Tom: ${names.indexOf("Tom")}")

    // 1B. Muttable List
    val names1 = mutableListOf<String>("Anu", "Tom", "Buff", "Saitama")
    names1.add("Sarah")
    println(names1)

    names1.removeAt(1) // Removed Tom
    names1.remove("Buff") //Removed Buff
    println(names1)

    names1.set(0, "Hi")
    names1[1]="John"
    println(names1)

    names1.clear()
    println(names1)

    // 2A. Immutable Set
    val names2 = setOf("Anu", "Anu", "Tom", "Buff")
    println("1.Size of Set: ${names2.size}")
    println("2. Set contains Buff: ${names2.contains("Buff")}")

    // 2B. Mutable Set
    val names3 = mutableSetOf<String>("Anu","hi", "Anu", "Tom", "Buff")
    names3.add("Hello")
    println(names)
    names3.remove("Don")
    println(names3)

    // 3A. Immutable Map
    val classRanks = mapOf(1 to "Anu",2 to "Goku", 3 to "Don",4 to "John")
    println("1. Students: ${classRanks.values}")
    println("2. Ranks: ${classRanks.keys}")
    println("3.  Don got a rank: ${classRanks.containsValue("Don")}")
    println("4. Is there a 3rd rank present: ${classRanks.containsKey(3)}")
    println("5. 1st rank: ${classRanks.get(1)}")

    // 3B. Mutable Map
    val classRanks1 = mutableMapOf(1 to "Anu",2 to "Goku", 3 to "Don",4 to "John")
    classRanks1.put(4, "Hello")
    classRanks1.put(5, "Snow")
    classRanks1.remove(2)
    println(classRanks1)
}