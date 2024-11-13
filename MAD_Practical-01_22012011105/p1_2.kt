fun main() {
    var i: Int = 10
    println("Integer Value : $i")
    var x: Double = i.toDouble()
    println("Double value (from Integer) : $x ")
    var s: String = "10"
    println("string Value : $s")
    i = s.toInt()
    println("Integer Value(from String) : $i")
    var y: Double = s.toDouble()
    println("Double Value(from String) : $i")
}

