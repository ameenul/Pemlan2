package com.Ecommerce;

public class Transaksi {

    int totalPay    ;

    void processPayment(Payment paymentMethode){
        paymentMethode.pay(totalPay);
    }

}


