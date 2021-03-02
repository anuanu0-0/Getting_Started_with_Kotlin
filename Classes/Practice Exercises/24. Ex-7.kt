import java.util.*
import kotlin.math.min

// Perform basic arthimetic operations on fractions
class Fraction(private var N:Int, private var D:Int) {
    init{
        simplify()
    }

    fun print() {
        println("$N/$D")
    }

    private fun simplify() {
        var gcd = 1
        val smaller = min(N, D)
        for(i in 2..smaller) {
            if(N%i == 0 && D%i == 0)
                gcd = i
        }
        N /= gcd
        D /= gcd
    }

    fun add(f2:Fraction) {
        N = N * f2.D + D * f2.N
        D *= f2.D
        simplify()
    }
    fun sub(f2:Fraction) {
        N = N * f2.D - D * f2.N
        D *= f2.D
        simplify()
    }
    fun multiply(f2:Fraction) {
        N *= f2.N
        D *= f2.D
        simplify()
    }
    fun divide(f2:Fraction) {
        N *= f2.D
        D *= f2.N
        simplify()
    }
}

fun main() {
    val read = Scanner(System.`in`)
    val n1:Int = read.nextInt()
    val d1:Int = read.nextInt()
    val n2:Int = read.nextInt()
    val d2:Int = read.nextInt()

    val f1 = Fraction(n1, d1)
    val f2 = Fraction(n2, d2)

    when(read.nextInt()){
        1-> {
            f1.add(f2)
            f1.print()
        }
        2->{
            f1.sub(f2)
            f1.print()
        }
        3->{
            f1.multiply(f2)
            f1.print()
        }
        4->{
            f1.divide(f2)
            f1.print()
        }
//        f1.print()

    }
}