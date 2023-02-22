fun main() {
   carriers()
    capital()
    numArray()
    println(vehicle("Wagon","SUV","Alphard"))

}
fun carriers (){
    val bags = arrayOf("backpack","suitcase","handbag","purse")
    println(bags.contentToString())
}
fun capital(){
    var cities = arrayOf("Harare","Nairobi","Dodoma","NewYork","Washington")
    println(cities.sortedArray().contentToString())
}
fun numArray (){

    var number = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(number[1] +number[4])
    println(number.indexOf(158))
    println(number.sortedArray().contentToString())
}
fun vehicle (name1:String,name2:String,name3:String) :String{
   return  ("$name1 $name2 $name3")



}




