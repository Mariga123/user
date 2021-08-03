fun main(args: Array<String>) {
    motto()
    mission()
    avg(3,4.5,5f)
    rectangle_area(10.0,30.0)
    cyliner_volume("Mariga", 3.4, 4.0)

}

fun motto(){
    println("WORKED")
}
fun mission(){
    println("WORKED")
}
fun avg(x:Int, y:Double, z:Float){
    var average = (x + y + z)/3.0
    println("your average is $average")
}
fun rectangle_area(l:Double, w:Double){
    var area = l * w
    println("your area is $area")
}
fun cyliner_volume(n:String, r:Double, h:Double){
    var volume = Math.PI * Math.pow(r,2.0) * h
    if (volume<10000)
        println("Hi $n, your volume is $volume and this is a small cylinder")
    while (volume>10000)
        println("Hi $n, your volume is $volume and this is a big cylinder")
}

