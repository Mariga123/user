import java.util.*

fun main(args: Array<String>) {
    var chukua = Scanner(System.`in`)
    println("enter name")
    var name = chukua.next()

    println("enter email")
    var email = chukua.next()

    println("enter you marks")
    var marks = chukua.nextDouble()

    println("enter your age")
    var age = chukua.nextInt()

    println("Hello $name, your email is $email, your age is $age and you scored $marks")
}