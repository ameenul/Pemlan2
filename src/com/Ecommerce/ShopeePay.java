package com.Ecommerce;

public class ShopeePay extends Payment {

    public ShopeePay() {
        this.paymentMethod = "ShopeePay";
    }

    @Override
      public void pay(int total){
        System.out.println("diskon untuk pembayaran menggunakan ShopeePay: 3000 ");

        total -= 3000; // diskon untuk pembayaran menggunakan ShopeePay 

        System.out.println
        ("Pembayaran sebesar " + total + 
       " menggunakan metode " + paymentMethod  + " berhasil dilakukan.");

    }   

}
