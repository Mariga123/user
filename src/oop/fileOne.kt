package oop

import java.util.*

fun main(args: Array<String>) {
    var gari1 = Car()
    println(gari1.model)

    var mwanafunzi1 = Student(name = "Grace",age = 1000, adm_no = "EMB/1001")
    var mwanafunzi2 = Student(name = "Mariga",age = 123, adm_no = "EMB/1002")
    var mwanafunzi3 = Student(name = "Issack",age = 100, adm_no = "EMB/1003")

     println(mwanafunzi1.name)
    var chukua = Scanner(System.`in`)
    println("Enter your name")
    var name = chukua.next()

    println("Enter your age")
    var age = chukua.nextInt()

    println("Enter your admission number")
    var admission = chukua.next()

    var mwanafunzi =Student(name,age,admission)
    println(mwanafunzi.name+ " " +mwanafunzi.age+ " " +mwanafunzi.adm_no)
}
class Car{
    var model = "Mercedes"
    var color = "Grey"
    var price = 1500000.00

    fun accelerate(){
        println("yeah i can accelerate")
    }
    fun brake(){
        println("yeah i can brake")
    }
}

class Student(name:String, age:Int, adm_no:String){
    var name:String
    var age:Int
    var adm_no:String
    //this is a constructor
    init {
        this.name = name
        this.age = age
        this.adm_no = adm_no
    }
    fun register(){
        println("yeah i can register")
    }
    fun login(){
        println("yeah i can login")
    }
}