package com.baru2;

public class Weapon {

    public String nama;
    int damage;
    Skill skill;

    public String getNama() {
        return nama;
    }

    public Weapon(String nama, int damage) {
        this.nama = nama;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return nama + " (Damage: " + getTotalDamage() + ")";
    }

    int getTotalDamage() {
        if (skill != null) {
            return damage + skill.bonusDamage;
        }
        return damage;
    }

}
