import java.util.*

fun main(args: Array<String>) {
    var my_scanner = Scanner(System.`in`)
    println("enter the principle")
    var p = my_scanner.nextDouble()
    println("enter the rate")
    var r = my_scanner.nextDouble()
    println("enter time")
    var t = my_scanner.nextDouble()
    var interest = (p*r*t)/100.0
    println("your interest is $interest")
}