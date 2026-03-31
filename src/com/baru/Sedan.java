package com.baru;

public class Sedan extends Mobil {

  
    public void jalan() {
       System.out.println(super.move());
    }

    @Override
    public String move() {
        return "Sedan " + getMerk() + " berwarna " + getWarna() + " sedang bergerak dengan kecepatan tinggi.";
    }

    public String move(int speed) {
        return "Sedan integer " + getMerk() + " berwarna " + getWarna() + " sedang bergerak dengan kecepatan " + speed + " km/h.";
    }

    public String move(float speed) {
        return "Sedan float " + getMerk() + " berwarna " + getWarna() + " sedang bergerak dengan kecepatan " + speed + " km/h.";
    }

}
