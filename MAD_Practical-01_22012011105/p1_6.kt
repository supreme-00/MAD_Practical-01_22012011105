fun add( a :Int , b:Int)
{
    var c = a + b
    println(" $a + $b = $c")
}
fun sub(a:Int , b:Int){
    var s = a-b
    println(" $a - $b = $s")
}
fun mul( a :Int , b:Int)
{
    var m = a*b
    println(" $a x $b = $m")
}
fun div(a:Int , b:Int){
    var d = a/b
    println(" $a / $b = $d")
}
fun main(){
    println("enter two integers :")
    var x = readLine()!!.toInt()
    var y = readLine()!!.toInt()
    add(x,y)
    sub(x,y )
    mul(x,y)
    div(x,y)
}