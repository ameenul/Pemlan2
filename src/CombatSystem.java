import com.baru2.Character;

public class CombatSystem {

    Character hero;
    Character musuh;

    public CombatSystem(Character hero, Character musuh){
        this.hero = hero;
        this.musuh = musuh;
    }

    String namaBattleSystem;

    // private static CombatSystem instance;

    // public static CombatSystem getInstance(){
    //     if(instance == null){
    //         instance = new CombatSystem();
    //     }
    //     return instance;
    // }   

    void battle(String namaBattleSystem){
        this.namaBattleSystem = namaBattleSystem;
        if(hero.weapon == null){
            System.out.println(hero.Nama + " tidak memiliki senjata untuk menyerang.");
            return;
        }
        if(musuh.weapon == null){
            System.out.println(musuh.Nama + " tidak memiliki senjata untuk menyerang.");
            return;
        }
        System.out.println(hero.Nama + " menyerang " + musuh.Nama + " dengan " + hero.weapon.nama);
        musuh.Attack(hero);
        
        System.out.println(musuh.Nama + " menyerang " + hero.Nama + " dengan " + musuh.weapon.nama);
        hero.Attack(musuh);

        System.out.println(hero.Nama + " HP: " + hero.getHp());
        System.out.println(musuh.Nama + " HP: " + musuh.getHp());
    }

}
