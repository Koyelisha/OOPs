interface Character{
    void attack();
}

interface Weapon{
    void use();
}

class Warrior implements Character,Weapon{
    public void attack(){
        System.out.println("Warrior is attacking with sword");
    }
    public void use(){
        System.out.println("Warrior is using sword");
    }
}

class Mage implements Character,Weapon{
    public void attack(){
        System.out.println("Mage is attacking with wand");
    }
    public void use(){
        System.out.println("Mage is using wand");
    }
}
public class Ques7 {
    public static void main(String[] args){
     Warrior w = new Warrior();
     Mage m = new Mage();
     w.attack();
     w.use();
     m.attack();
     m.use();
       }
       
    }
