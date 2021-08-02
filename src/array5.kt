import java.util.*

fun main(args: Array<String>) {
//    var scanner_yangu =Scanner(System.`in`)
//    println("how many names do you have")
//    var number_of_names = scanner_yangu.nextInt()
//    println("enter the $number_of_names names")
//    //create  a string arrays
//    //write a loop to take the names
//    var names = arrayOfNulls<String>(number_of_names)
//    // write a loop to take the names
//    var position = 0
//    while (position < number_of_names){
//        names[position] = scanner_yangu.next()
//        position ++
//    }
//    for (jina in names){
//        println(jina)
//    }
    //create a logic that will capture both the names and
    //admission number of any number of students

    var admin = Scanner(System.`in`)
    println("Enter your admission number")
    var adminNo = admin.nextInt()
    println("Your $adminNo number is successfully captured")
    //create  a string arrays
    //write a loop to take the names
//    var jina = Scanner(System.`in`)
//    println("How names do you have")
//    var number_of_names = jina.nextInt()
//    println("Enter the $number_of_names you have")
//    var names = arrayOfNulls<String>(number_of_names)
//    var position = 0
//    while (position < number_of_names){
//        names[position] = jina.next()
//        position ++
//    }
//    for (print in names){
//        println("Hello $print your registration for admission number $adminNo is registered successfully")
//    }
//
    var my_scanner = Scanner(System.`in`)
    println("How many names do you have")
    var number_of_names = my_scanner.nextInt()
    println("Enter the names with their corresponding ADM numbers")
    var names = arrayOfNulls<String>(number_of_names)
    var adm_numbers = arrayOfNulls<String>(number_of_names)

    var position = 0
    while (position < number_of_names) {
        names[position] = my_scanner.next()
        adm_numbers[position] = my_scanner.next()
        position++
    }
    var print_position = 0
    while (print_position<number_of_names){
        println("names is "+names[print_position]+"--------Adm No is "+adm_numbers[print_position])
        print_position++
    }

}