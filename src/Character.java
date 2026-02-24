public class Character {

    int hp;
    String Nama;
    Weapon weapon;

    public Character(String Nama, int hp) {
        this.Nama = Nama;
        this.hp = hp;
    }

  
    void Attack( Character musuh)
    {
        if(weapon == null)
        {
            System.out.println(Nama + " tidak memiliki senjata untuk menyerang.");
            return;
        }
        System.out.println(Nama + " menyerang " + musuh.Nama + " dengan " + weapon.nama);
        musuh.hp -= weapon.getTotalDamage();
    }


}
