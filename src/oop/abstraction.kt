package oop

fun main(args: Array<String>) {
    var xyz = MySecond("king","king123")
    println(xyz.email)
    xyz.acc_balance_checker()
    xyz.age_checker()

}
abstract class MyFirst(open var name:String, open var email:String){
    abstract fun age_checker()
    abstract fun acc_balance_checker()
}
class MySecond (override var name: String, override var email: String):MyFirst(name,email){
    override fun acc_balance_checker() {
        println("yeah i can check the balance")
    }

    override fun age_checker() {
        println("yeah i can check the balance")
    }
}