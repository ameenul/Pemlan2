import com.baru.Enemy;
import com.baru.Hero;
import com.baru.NPC;
import com.baru2.Character;
import com.baru2.Weapon;

public class App {

    public static void main(String[] args) throws Exception {

        Hero hero = new Hero("Hero", 100);
        NPC npc = new NPC("NPC", 50);
        Enemy enemy = new Enemy("Enemy", 80);

        hero.jump();
        hero.Attack(enemy);
        npc.talk();
        npc.Attack(hero);
        enemy.fly();
        enemy.Attack(hero);




        // String password ="Asadsadas123";
        // if (!isPasswordValid(password)) {
        //     System.out.println("Password tidak valid. Harus mengandung minimal 1 huruf besar (uppercase).");
        //     return;
        // }
        // System.out.println("Password valid.");
        
       
        // Character hero = new Character("Hero", 100);
        // Character musuh = new Character("Musuh", 90);
        // Weapon pedang = new Weapon("Pedang", 10);
        // Weapon busur = new Weapon("Busur", 7);
        // hero.weapon = pedang;
        // musuh.weapon = busur;

        // CombatSystem CS = CombatSystem.getInstance();
        // // CombatSystem CS2 = CombatSystem.getInstance();
        // CombatSystem CS = new CombatSystem(hero, musuh);
        // CS.battle( "Battle System 1");
        // System.out.println("Nama Battle System: " + CS.namaBattleSystem);
    
        // musuh.Attack(hero);
        // System.out.println(hero.Nama + " HP: " + hero.getHp());
        // //



        // //App app = new App();
        // cetakKarakter(hero, musuh);
        // System.out.println("kuadrat dari 5: " + Math.pow(5, 2));




        // System.out.println(hero.Nama + " HP: " + hero.hp);
        // System.out.println(musuh.Nama + " HP: " + musuh.hp);
        // System.out.println();




        // Character.totalCharacters = 10;
        // Character.totalCharacters = 20;
        // System.out.println("Total Characters: " + hero.getTotalCharacters());
        // System.out.println("Total Characters: " + musuh.totalCharacters);







        // Weapon pedang = new Weapon("Pedang", 10);
        // Weapon busur = new Weapon("Busur", 7);
        // Weapon tongkat = new Weapon("Tongkat", 5);
        // Character hero = new Character("Hero", 100);
        // Character musuh = new Character("Musuh", 100);

        // Skill skillPedang = new Skill();
        // skillPedang.bonusDamage = 5;
        // pedang.skill = skillPedang;
        // tongkat.skill = pedang.skill;
        // tongkat.skill.bonusDamage = 3 ;
    

        // System.out.println(pedang.getTotalDamage());//10+3=13
        // System.out.println(tongkat.getTotalDamage());//5+3=8
        

    }

    static boolean isPasswordValid(String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            if (java.lang.Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }

        return false;
    }

    // static void cetakKarakter(Character ...karakter)
    // {
       
    //         for(Character k : karakter)
    //         {
    //             System.out.println(k.Nama);
    //         }   
       
    // }



}
