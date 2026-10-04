fun main() {

    // String şablonları: $ ve ${} ile metin içine değer gömme

    val ad = "Enes"
    val yas = 23

    println("Merhaba, ben $ad ve $yas yaşındayım.")
    println("Gelecek yıl ${yas + 1} yaşında olacağım.")


    // Çok satırlı ham string (raw string)
    val jsonOrnek = """
        {
            "ad": "$ad",
            "yas": $yas
        }
    """.trimIndent()

    println(jsonOrnek)


    // String birleştirme yerine şablon tercih edilir
    val sehir = "İstanbul"
    val mesaj = "Yaşadığım şehir: $sehir (${sehir.length} harf)"
    println(mesaj)
}
