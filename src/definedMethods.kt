import java.util.*

fun main(args: Array<String>) {
    var my_scanner = Scanner(System.`in`)
    println("Hello please enter your name")
    var name = my_scanner.next()

    println("Enter your weight in kgs")
    var weight = my_scanner.nextDouble()

    println("Enter your height in cm")
    var height = my_scanner.nextDouble()

    bmi_calc(name,weight,height)
}
fun bmi_calc(n:String, w:Double, h:Double){
    var bmi = (w /h) * 703.0
    if (bmi<50.0)
        println("Hi $n, your BMI is $bmi and you are underweight")
    else if (bmi>60.0)
        println("Hi $n, your BMI is $bmi and you have a normal weight")
    while (bmi<80)
        println("Hi $n, your BMI is $bmi and you are overweight/obesse")

}