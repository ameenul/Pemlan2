public class App {
    public static void main(String[] args) throws Exception {
        
        Weapon pedang = new Weapon("Pedang", 10);
        Weapon busur = new Weapon("Busur", 7);
        Weapon tongkat = new Weapon("Tongkat", 5);
        Character hero = new Character("Hero", 100);
        Character musuh = new Character("Musuh", 100);

        Skill skillPedang = new Skill();
        skillPedang.bonusDamage = 5;
        pedang.skill = skillPedang;
        tongkat.skill = pedang.skill;
        tongkat.skill.bonusDamage = 3 ;
    

        System.out.println(pedang.getTotalDamage());//10+3=13
        System.out.println(tongkat.getTotalDamage());//5+3=8
        

    }
}
