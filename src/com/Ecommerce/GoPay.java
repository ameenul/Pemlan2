package com.Ecommerce;

public class GoPay extends Payment {

    public GoPay() {
        this.paymentMethod = "GoPay";
    }

    @Override
      public void pay(int total){
        System.out.println("Biaya tambahan untuk pembayaran menggunakan GoPay: 5000 ");

        total += 5000; // Biaya tambahan untuk pembayaran menggunakan GoPay 

        System.out.println
        ("Pembayaran sebesar " + total + 
       " menggunakan metode " + paymentMethod  + " berhasil dilakukan.");

    }


    void topUp(int amount) {
        System.out.println("Top-up sebesar " + amount + " ke akun GoPay berhasil");
        }

}
