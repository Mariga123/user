fun main(args: Array<String>) {
    var age: Int
    age = 12
    if (age < 18) {
        println("you are underage")
    } else {
        println("you qualify")
    }

    var marks = 80
    if (marks < 40) {
        println("E")
    } else if (marks < 50) {
        println("D")
    } else if (marks < 60) {
        println("c")
    } else {
        println("A")
    }
    var number = 4
    when(number) {
        1 ->{
            println("number one was found")
        }
        2 ->{
            println("number two was found")
        }
        3 ->{
            println("number three was found")
        }
        else ->{
            println("sorry we don't have that number")
        }
    }
}