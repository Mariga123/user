import java.util.*

fun main(args: Array<String>) {
    var bmi = Scanner(System.`in`)
    println("enter your weight")
    var w = bmi.nextDouble()

    println("enter your height")
    var h = bmi.nextDouble()

    var bmis = (w/h)*10000
    println("your bmis is $bmis")
}