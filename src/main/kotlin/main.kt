fun main() {

    var result = comission("VK_Pay", 10_000, 0)

    if (result == 0) {
        println("Комиссия равна нулю")
    } else if (result == -1) {
        println("Лимит по карте превышен")
    } else if (result == -2) {
        println("Выбрана некорректная карта")
    } else {
        println(result)
    }
}

fun comission(typeCard: String, transfer: Int, previous: Int) :  Int {
    return when(typeCard) {
        "MasterCard" -> when {
            transfer > 150_000 || transfer + previous > 600_000 -> -1
            transfer in 0 .. 74999 -> 0
            else -> (transfer * 0.006f).toInt() + 20
        }
        "Visa" -> when {
            transfer > 150_000 || transfer + previous > 600_000 -> -1
            else -> (transfer * 0.0075f).toInt()
        }
        "VK_Pay" -> when {
            transfer > 15_000 || transfer + previous > 40_000 -> -1
            else -> 0
        }
        else -> -2
    }
}