fun main() {

    // Temel koleksiyonlar: listOf, mutableListOf, setOf, mapOf

    val meyveler = listOf("Elma", "Armut", "Çilek")
    println("İlk meyve: ${meyveler.first()}")
    println("Liste boyutu: ${meyveler.size}")

    val notlar = mutableListOf(70, 85, 90)
    notlar.add(95)
    println("Güncel notlar: $notlar")


    val benzersizSayilar = setOf(1, 2, 2, 3, 3, 3)
    println("Set (tekrarlar yok): $benzersizSayilar")


    val ogrenciNotlari = mapOf(
        "Ali" to 88,
        "Ayşe" to 92,
        "Mehmet" to 76
    )

    println("Ayşe'nin notu: ${ogrenciNotlari["Ayşe"]}")

    for ((isim, not) in ogrenciNotlari) {
        println("$isim -> $not")
    }
}
