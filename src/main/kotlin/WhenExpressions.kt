fun main() {

    // when ifadesi: Java'daki switch'in Kotlin karşılığı; if-else zincirlerine de alternatif olur.

    val not = 85

    val harfNotu = when (not) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }

    println("Not: $not -> Harf: $harfNotu")


    val gun = 3

    val gunAdi = when (gun) {
        1 -> "Pazartesi"
        2 -> "Salı"
        3 -> "Çarşamba"
        4 -> "Perşembe"
        5 -> "Cuma"
        6, 7 -> "Hafta sonu"
        else -> "Geçersiz gün"
    }

    println("Gün numarası $gun: $gunAdi")


    // Argümansız when: koşulları sırayla dener
    val sicaklik = 28

    when {
        sicaklik < 0 -> println("Donma riski")
        sicaklik in 0..15 -> println("Serin")
        sicaklik in 16..30 -> println("Ilık")
        else -> println("Sıcak")
    }
}
