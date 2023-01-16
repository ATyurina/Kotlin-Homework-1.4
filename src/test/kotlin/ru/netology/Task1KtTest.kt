package ru.netology

import org.junit.Test

import org.junit.Assert.*

class Task1KtTest {

    @Test
    fun calcAmountMastercardFreeCommission() {
        val cartType = "Mastercard"
        val previousTransfers = 1_000
        val transferAmount = 20_000

        val result = ru.netology.calcAmount(cartType, previousTransfers, transferAmount)

        assertEquals(20_000,result)
    }

    @Test
    fun calcAmountMastercardMinCommission() {
        val cartType = "Mastercard"
        val previousTransfers = 60_000
        val transferAmount = 20_000

        val result = ru.netology.calcAmount(cartType, previousTransfers, transferAmount)

        assertEquals(20_140,result)
    }

    @Test
    fun getErrorAmountMastercard() {
        val cartType = "Mastercard"
        val previousTransfers = 550_000
        val transferAmount = 100_000

        val result = ru.netology.calcAmount(cartType, previousTransfers, transferAmount)

        assertEquals(0,result)
    }

    @Test
    fun calcAmountVisaMinCommission() {
        val cartType = "Visa"
        val previousTransfers = 10_000
        val transferAmount = 2_000

        val result = ru.netology.calcAmount(cartType, previousTransfers, transferAmount)

        assertEquals(2035,result)
    }

    @Test
    fun calcAmountVisaCommission() {
        val cartType = "Visa"
        val previousTransfers = 10_000
        val transferAmount = 20_000

        val result = ru.netology.calcAmount(cartType, previousTransfers, transferAmount)

        assertEquals(20150,result)
    }

    @Test
    fun getErrorAmountVisa() {
        val cartType = "Visa"
        val previousTransfers = 550_000
        val transferAmount = 100_000

        val result = ru.netology.calcAmount(cartType, previousTransfers, transferAmount)

        assertEquals(0,result)
    }

    @Test
    fun calcAmountVKCommission() {
        val cartType = "VK Pay"
        val previousTransfers = 1_000
        val transferAmount = 20_000

        val result = ru.netology.calcAmount(cartType, previousTransfers, transferAmount)

        assertEquals(20_000,result)
    }

    @Test
    fun calcAmountError() {
        val cartType = "VK Pal"
        val previousTransfers = 1_000
        val transferAmount = 20_000

        val result = ru.netology.calcAmount(cartType, previousTransfers, transferAmount)

        assertEquals(0,result)
    }
}