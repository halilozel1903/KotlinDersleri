

fun main() {

    var age : Byte = 23
    var number1 : Short = 31000
    var number2 : Int = 222222
    var number3 : Long = 12345L
    var number4 : Float = 1122.55F
    var number5 : Double = 535353.789

    println(age)
    println(number1)
    println(number2)
    println(number3)
    println(number4)
    println(number5)


    var newNumber = number4.toInt()

    println("New number : "+newNumber)



    // Boolean

    var kucukMu = 3>5

    println(kucukMu)


    // char

    var karakterim = 'G'
    println(karakterim)


    // string

    var schoolname = "Atatürk Üniversitesi"
    println(schoolname)


    // array

    var tekDiziler = arrayOf(1,3,5,7,9)

    println(tekDiziler[0])

    println(tekDiziler.size)
}