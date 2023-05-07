import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun comissionForMasterCard1() {
        val typeCard = "MasterCard"
        val transfer = 100_000
        val previous = 0
        val result = comission(typeCard, transfer, previous)
        assertEquals(620, result)
    }

    @Test
    fun comissionForMasterCard2() {
        val typeCard = "MasterCard"
        val transfer = 200_000
        val previous = 0
        val result = comission(typeCard, transfer, previous)
        assertEquals(-1, result)
    }

    @Test
    fun comissionForMasterCard3() {
        val typeCard = "MasterCard"
        val transfer = 100_000
        val previous = 600_000
        val result = comission(typeCard, transfer, previous)
        assertEquals(-1, result)
    }

    @Test
    fun comissionForMasterCard4() {
        val typeCard = "MasterCard"
        val transfer = 50_000
        val previous = 0
        val result = comission(typeCard, transfer, previous)
        assertEquals(0, result)
    }

    @Test
    fun comissionForVisa1() {
        val typeCard = "Visa"
        val transfer = 10_000
        val previous = 0
        val result = comission(typeCard, transfer, previous)
        assertEquals(75, result)
    }

    @Test
    fun comissionForVisa2() {
        val typeCard = "Visa"
        val transfer = 200_000
        val previous = 0
        val result = comission(typeCard, transfer, previous)
        assertEquals(-1, result)
    }

    @Test
    fun comissionForVisa3() {
        val typeCard = "Visa"
        val transfer = 100_000
        val previous = 600_000
        val result = comission(typeCard, transfer, previous)
        assertEquals(-1, result)
    }

    @Test
    fun comissionForVKPay1() {
        val typeCard = "VK_Pay"
        val transfer = 10_000
        val previous = 0
        var result = comission(typeCard, transfer, previous)
        assertEquals(0, result)
    }

    @Test
    fun comissionForVKPay2() {
        val typeCard = "VK_Pay"
        val transfer = 20_000
        val previous = 0
        var result = comission(typeCard, transfer, previous)
        assertEquals(-1, result)
    }

    @Test
    fun comissionForVKPay3() {
        val typeCard = "VK_Pay"
        val transfer = 10_000
        val previous = 40_000
        var result = comission(typeCard, transfer, previous)
        assertEquals(-1, result)
    }

    @Test
    fun comissionError() {
        val typeCard = "noName"
        val transfer = 10_000
        val previous = 0
        val result = comission(typeCard, transfer, previous)
        assertEquals(-2, result)
    }
}