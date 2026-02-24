public class App {
    public static void main(String[] args) throws Exception {
        
        Character hero = new Character("Hero", 100);
        Character musuh = new Character("Musuh", 90);

        //App app = new App();
        cetakKarakter(hero, musuh);
        System.out.println("kuadrat dari 5: " + Math.pow(5, 2));




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

    static void cetakKarakter(Character ...karakter)
    {
       
            for(Character k : karakter)
            {
                System.out.println(k.Nama);
            }   
       
    }



}
