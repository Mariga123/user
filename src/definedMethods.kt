import java.util.*

fun main(args: Array<String>) {
    var my_scanner = Scanner(System.`in`)
    println("Enter your name")
    var name = my_scanner.next()

    println("Enter the radius")
    var radius = my_scanner.nextDouble()

    println("Enter the height")
    var height = my_scanner.nextDouble()

    cyliner_volume_one(name,radius,height)
}
fun cyliner_volume_one(n:String, r:Double, h:Double){
    var volume = Math.PI * Math.pow(r,2.0) * h
    if (volume<10000)
        println("Hi $n, your volume is $volume and this is a small cylinder")
    while (volume>10000)
        println("Hi $n, your volume is $volume and this is a big cylinder")
}