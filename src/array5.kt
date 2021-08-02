import java.util.*

fun main(args: Array<String>) {
    var scanner_yangu =Scanner(System.`in`)
    println("how many names do you have")
    var number_of_names = scanner_yangu.nextInt()
    println("enter the $number_of_names names")
    //create  a string arrays
    //write a loop to take the names
    var names = arrayOfNulls<String>(number_of_names)
    // write a loop to take the names
    var position = 0
    while (position < number_of_names){
        names[position] = scanner_yangu.next()
        position ++
    }
    for (jina in names){
        println(jina)
    }
}