enum class Metal(val symbol:String) {
    IRON("Fe"),
    GOLD("Au"),
    SILVER("Ag")
}

fun main() {
    for(metal in Metal.values()) {
        println("Symbol : ${metal.symbol}, Name: ${metal.name}, Ordinal: ${metal.ordinal}")
    }

    printMetal(Metal.IRON)
}

fun printMetal(metal: Metal){
    println(metal.name)
}