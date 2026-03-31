package com.baru;
import com.baru2.Character;

public class Enemy extends Character {

    public Enemy(String Nama, int hp) {
        super(Nama, hp);
    }

    public void fly() {
        System.out.println(Nama + " enemy sedang terbang!");
    }

}
