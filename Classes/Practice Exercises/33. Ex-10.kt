// Given a 3-D shape find the lateral surface area, total surface area and volume of the given shape.
// Input : 1 for sphere, 2 for cylinder , 3 for cube
import java.util.Scanner;

open class Shapes {
    var lsa = 0
    var tsa = 0
    var volume = 0
    fun print() {
        print("$lsa $tsa $volume")
    }
}

class Sphere(private val r: Int):Shapes() {
    init {
        lsa = 4*3*r*r
        tsa = lsa
        volume = 4*r*r*r
    }
}

class Cyclinder(private val r:Int, private val h:Int):Shapes() {
    init {
        lsa = 2*3*r*h
        tsa = 2*3*r*(r+h)
        volume = 3*r*r*h
    }
}
class Cube (private val s:Int):Shapes() {
    init {
        lsa = 4*s*s
        tsa = 6*s*s
        volume = s*s*s
    }
}

fun main() {
    val read = Scanner(System.`in`)

    when(read.nextInt()) {
        1 -> {
            var r = read.nextInt()
            Sphere(r).print()
        }
        2 -> {
            var r = read.nextInt()
            var h = read.nextInt()
            Cyclinder(r,h).print()
        }
        3 -> {
            var r = read.nextInt()
            Cube(r).print()
        }
    }

}