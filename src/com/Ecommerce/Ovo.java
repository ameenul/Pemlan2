package com.Ecommerce;

public class Ovo extends Payment {

    public Ovo() {
        this.paymentMethod = "Ovo";
    }

    @Override


   public void pay(int total){
        System.out.println("diskon untuk pembayaran menggunakan Ovo: 5000 ");

        total -= 5000; // diskon untuk pembayaran menggunakan Ovo 

        System.out.println
        ("Pembayaran sebesar " + total + 
       " menggunakan metode Ovo berhasil dilakukan.");

    }

}
