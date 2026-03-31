package com.baru;

public class Mobil {

    private String merk;
    private String warna;

    // //implisit
    // public Mobil() {
   
    // }   

     public Mobil(String merk, String warna) {
        this.merk = merk;
         this.warna = warna;
    }

    public Mobil() {
      
    }



    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public String move() {
        return "Mobil " + merk + " berwarna " + warna + " sedang bergerak.";
    }



}
