fun main() {
    var school = "akirachix"
    var char1 = school[0]
    var char3 = school[2]
    var char5 = school[4]
    var result = "$char1$char3$char5"
    println(result)
    var school2 = "akirachix"
    var resultt = school[0].toString() + school[2] + school[4]
    println(resultt)
    var nice = kotlin("jepchirchir", "23")
    println(nice)
    var takestring = "chirii"
    println("the length of my name is " + takestring.length)
    var me = "mercy"
    if (me == "kemboi")
        println("thats me")
        else{
            println("thats not me")
    }


}
fun kotlin(name:String,age:String):String{
    var me = "hi my name is $name and am $age years old"
    return me

}
