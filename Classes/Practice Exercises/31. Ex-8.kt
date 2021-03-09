// Add, multiply and print complex number

import java.util.Scanner;

class ComplexNumber( var R : Int,  var I : Int) {

    fun printComplex() {
        println("$R + i($I)")
    }

    fun plus(c2 : ComplexNumber) {
            R += c2.R
            I += c2.I
    }

    fun multiply(c2 : ComplexNumber) {
        var sol = ComplexNumber((R*c2.R) - (I*c2.I), c2.I*R  +  c2.R*I)
        R = sol.R
        I = sol.I
    }
}

fun main() {
    val read = Scanner(System.`in`)
    val r1 = read.nextInt()
    val i1 = read.nextInt()
    val r2 = read.nextInt()
    val i2 = read.nextInt()

    val c1 = ComplexNumber(r1,i1)
    val c2 = ComplexNumber(r2,i2)

    when(read.nextInt()) {
        1 -> {
            c1.plus(c2)
            c1.printComplex()
        }
        2 -> {
            c1.multiply(c2)
            c1.printComplex()
        }
    }

}