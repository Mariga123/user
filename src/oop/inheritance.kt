package oop

fun main(args: Array<String>) {
    var teacher = Mwalimu("king","king123")
    teacher.register()
    println(teacher.email)
}
open class Mwanafunzi(open var email:String, open var password:String){
    fun register(){
        println("yeah i can login")
    }
    fun login(){
        println("yeah i can login")
    }
}
class Mwalimu(override var email: String, override var password: String):Mwanafunzi(email,password){
    fun add_marks(){
        println("yeah i can add marks")
    }
}
