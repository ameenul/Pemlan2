public class Weapon {

    String nama;
    int damage;
    Skill skill;


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
