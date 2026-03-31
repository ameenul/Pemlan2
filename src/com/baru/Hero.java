package com.baru;

import com.baru2.Character;
public class Hero extends Character {

    public Hero(String Nama, int hp) {
        super(Nama, hp);
    }

    public void jump() {
        System.out.println(Nama + 
            " hero sedang melompat! membawa weapo :"+ 
            weapon.getNama());
    }

}
