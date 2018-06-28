/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horse;

/**
 *
 * @author gpcorser
 */
public class Horse {
    
    private String name = "Horse";
    public String food = "Oats";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal a = new Animal();
        System.out.println(a.name);
        a.talk();
        
        Mare m = new Mare();
        System.out.println(m.name);
        m.talk();
        
        Stallion s = new Stallion();
        System.out.println(s.name);
        s.talk();
        
        Centaur c = new Centaur();
        System.out.println(c.name);
        c.talk();
        c.hunt();
        
        Unicorn g = new Unicorn();
        System.out.println(g.name);
        g.talk();
        
    }
    
}

class Animal {
    
    public String name = "Animal";
    public String food = "Food";
    
    public void talk() {
        System.out.println("Hey.");
    }
}

class Mare extends Animal {
    
    public String name = "Tornado";
    public String food = "Oats";
    
    public void talk() {
        System.out.println("Neigh.");
    }
    
}

class Stallion extends Mare {
    
    public String name = "Peanut Butter";
    
}

class Centaur extends Stallion {
    
    public String food="Deer";
    public String name = "my name is Thresher ";
    public void talk() {
        System.out.println("Hello");
    }
    
     public void hunt() {
        System.out.println("I have shot a " + food);
    }
}

class Unicorn extends Mare {

    public String name = " Buttercup";

    public String food= " Magic ";
    
 public void talk() {
        System.out.println("Majestic Neigh");
    }

}
// These are new comments
