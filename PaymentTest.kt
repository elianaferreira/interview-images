package com.github.eferreira.paymentTest

import com.github.eferreira.paymentTest.model.Payment

interface PaymentInterface {
    fun processPayment(payment: Payment)
    fun validatePayment(payment: Payment)
    fun printPaymentVoucher(payment: Payment)
    fun sendPaymentVoucherByEmail(payment: Payment, email: String)
}


class ProcessPayment(): PaymentInterface {
    override fun processPayment(payment: Payment) {
        //send payment over POST request to the server
    }

    override fun validatePayment(payment: Payment) {
        //validatePayment against the server
    }

    override fun printPaymentVoucher(payment: Payment) {
    }

    override fun sendPaymentVoucherByEmail(payment: Payment, email: String) {
    }

}


class PrintingPayment(): PaymentInterface {
    override fun processPayment(payment: Payment) {
    }

    override fun validatePayment(payment: Payment) {
    }

    override fun printPaymentVoucher(payment: Payment) {
        //generate a voucher and log into a file
    }

    override fun sendPaymentVoucherByEmail(payment: Payment, email: String) {
        //request to the server to send the payment via Email
    }

}