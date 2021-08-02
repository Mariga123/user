fun main(args: Array<String>) {
    var x = 20
    var y = if (x<10){
        "x is less than 10"
    }else{
        "X is not less than 10"
    }
    println(y)

    var number = 4
    var result = if (number == 1){
        "you lost!!!"
    }else if (number == 2){
        "you still lost"
    }else if (number == 3){
        "congrats you won"
    }else if (number == 4){
        "you lost"
    }else{
        "please enter a number from 1 to 4"
    }
    println(result)

    var a = 2
    var b = when(a){
        1 ->{
            "one was found"
        }
        2 ->{
            "two was found"
        }
        3 ->{
            "three was found"
        } else ->{
            "we don't know that number"
        }
    }
    println(b)
}
