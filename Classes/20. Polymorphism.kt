open class Vehicle{
    open fun startEngine() {
        // code to start the engine
        println("Vehicle started")
    }
}

class BMWCar(): Vehicle() {
    override fun startEngine() {
        println("BMW's engine started")
        super.startEngine()
    }
}

class AudiCar():Vehicle() {
    override fun startEngine() {
        println("Audi's engine started")
        super.startEngine()
    }
}

fun main() {
    // Method 1:
    val bmwCar:BMWCar = BMWCar()
    startBmwCar(bmwCar)

    val audiCar:AudiCar = AudiCar()
    startAudiCar(audiCar)

    // Method 2: Using Superclass
    val bCar:Vehicle = BMWCar()
    startVehicle(bCar)

    val aCar : Vehicle = AudiCar()
    startVehicle(aCar)
}
// Method 1 :
fun startBmwCar(car: BMWCar){
    car.startEngine()
}
fun startAudiCar(car: AudiCar){
    car.startEngine()
}

// Method 2:
fun startVehicle(car:Vehicle) {
    car.startEngine()
}