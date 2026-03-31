package com.baru;
import com.baru2.Character;

public class NPC extends Character {

    public NPC(String Nama, int hp) {
        super(Nama, hp);
    }

    public void talk() {
        System.out.println(Nama + " NPC sedang berbicara!");
    }

}
