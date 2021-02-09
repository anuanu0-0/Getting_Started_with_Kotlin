fun main() {
    //List
    //listOf creates an immutable list
    val names = listOf("Anu","Goku", "Don", "John")
    println("1. Size of the list: ${names.size}")
    println("2. Second item of the list: ${names.get(1)}")
    println("3. Second item of the list using Index operator: ${names[1]}")
    println("4. Don is at the index: ${names.indexOf("Don")}")
    println("5. Mon is at the index: ${names.indexOf("Mon")}")

    //Mutable list
    val names1 = mutableListOf("Anu","Goku", "Don", "John")
    names1.add("Sarah")
    println(names1)
    names1.removeAt(1)
    names1.remove("John")
    println(names1)
    names1.set(0, "Michael")
    names1[1]= "James"
    println(names1)
    names1.clear()
    println(names1)

    //Set
    val names2 = setOf("Anu","Goku", "Don", "John")
    println("1. The size of the Set is: ${names2.size}")
    println("2. Set contains ${names.contains("Don")}")
    // names2.add("Hello")

    //Mutable Set
    val names3 =  mutableSetOf("Anu","Goku", "Don", "John")
    names3.add("Hello")
    println(names3)
    names3.remove("Don")
    println(names3)

    // Map
    val classRanks = mapOf(1 to "Anu",2 to "Goku", 3 to "Don",4 to "John")
    println("1. Students: ${classRanks.values}")
    println("2. Ranks: ${classRanks.keys}")
    println("3.  Don got a rank: ${classRanks.containsValue("Don")}")
    println("4. Is there a 3rd rank present: ${classRanks.containsKey(3)}")
    println("5. 1st rank: ${classRanks.get(1)}")

    // Mutable Map
    val classRanks1 = mutableMapOf(1 to "Anu",2 to "Goku", 3 to "Don",4 to "John")
    classRanks1.put(4, "Hello")
    classRanks1.put(5, "Snow")
    classRanks1.remove(2)
    println(classRanks1)

    
}