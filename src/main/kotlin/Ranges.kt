fun main() {

    // Aralıklar (ranges): .. ve until ile sayı dizileri tanımlanır.

    val birOn = 1..10
    println("1..10 içinde 5 var mı? ${5 in birOn}")
    println("1..10 son eleman: ${birOn.last}")


    // until: bitiş dahil değil (half-open)
    val sifirdanDort = 0 until 4
    println("0 until 4: ${sifirdanDort.toList()}")


    // downTo ve step
    val geriSayim = 5 downTo 1 step 1
    print("Geri sayım: ")
    for (sayi in geriSayim) {
        print("$sayi ")
    }
    println()


    // for döngüsünde aralık kullanımı
    var ciftToplam = 0
    for (n in 2..20 step 2) {
        ciftToplam += n
    }
    println("2..20 arası çift sayıların toplamı: $ciftToplam")


    // Char aralıkları
    val harfler = 'a'..'e'
    println("'a'..'e': ${harfler.joinToString("")}")
}
