package com.baru2;
import com.baru2.Weapon;


public class Character {

    private int hp;
    public String Nama;
    public Weapon weapon;
    static int totalCharacters = 0;

    public Character(String Nama, int hp) {
        this.Nama = Nama;
        this.hp = hp;
        totalCharacters++;
    }

    public static int getTotalCharacters() {
        //System.out.println("nama Karakter: " + Nama);
        return totalCharacters;
    }

  
    public void Attack( Character musuh)
    {
        //System.out.println(totalCharacters);
        if(weapon == null)
        {
            System.out.println(Nama + " tidak memiliki senjata untuk menyerang.");
            return;
        }
        System.out.println(Nama + " menyerang " + musuh.Nama + " dengan " + weapon.nama);
        musuh.hp -= weapon.getTotalDamage();
    }

    public int getHp() {
        return hp;
    }


}
