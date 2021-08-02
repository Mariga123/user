fun main(args: Array<String>) {
    var x = 0
    while (x<=5){
        println(x)
        x++
    }
    var y = 16
    do {
        println(y)
        y++
    }while (y <=20)

    //var numbers = 45..70
    var numbers = 90 downTo 50
    for (nambari in numbers){
        println(nambari)
    }
    var names = arrayOf("mariga","Grace","issack","liz","10")
    for (jina in names){
        println(jina)
    }

    var z = "12"
    repeat(10){
        println(z)
    }
}