fun main() {

    var name : String? = null

    name = "Halil"

    println("Name length : "+name?.length)

    var surname : String = "Ozel"

    println("Surname length : "+surname.length)


    var age : Int? = null

    println(name!!.length)

    println(age!!)
}