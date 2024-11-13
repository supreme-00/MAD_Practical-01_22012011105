class Car(var type: String, val year: String, var price: Double, var owner: String, var milesDriven: Int) {
    fun getCarInfo() {
        println("Car Information:  $type, $year" )
        println("Owner: $owner, " )
        println("Miles Driven: $milesDriven")
    }

    fun getOriginalPrice(): Double = price
    fun getCurrentPrice(): Double = price - (milesDriven * 0.1)

    fun displayCarInfo() {
        getCarInfo()
        println("Original Price: $price," )
        println("Current Price: ${getCurrentPrice()}")
    }
}
fun main() {
    val car1 = Car("Sedan", "2018" , 800000.00,"John Doe", 1500)
    car1.displayCarInfo()
    println()
    val car2 = Car("Audi", "2020" , 5000000.00,"guy", 1500)
    car2.displayCarInfo()
}