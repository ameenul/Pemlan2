package com.Ecommerce;

public class TestApp {

    public static void main(String[] args) {
        Transaksi transaksi = new Transaksi();
        transaksi.totalPay = 100000; // Total pembayaran

        GoPay goPay = new GoPay();
        transaksi.processPayment(goPay); // Memproses pembayaran menggunakan GoPay

        ShopeePay shopeePay = new ShopeePay();
        transaksi.processPayment(shopeePay); // Memproses pembayaran menggunakan ShopeePay
  
        Ovo ovo = new Ovo();
        transaksi.processPayment(ovo); // Memproses pembayaran menggunakan Ovo
  
    }

}
