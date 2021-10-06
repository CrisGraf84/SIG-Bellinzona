/*

 */
package animali;

/**
 *
 * @author Cristoforo Graf
 */
public class TestClass
{
    public static void main(String[] args) throws Exception
    {
        Herbivore h = new Herbivore("Gnu", "Mammifero", "Sniff");
        Carnivorous c = new Carnivorous("Tigre", "Felino", "Growl");
        
        c.eatAnimal(h);
        
        Herbivore h1 = new Herbivore("Topo", "Mammifero", "Squit");
        Carnivorous c1 = new Carnivorous("Gatto", "Felino", "Meow");
        
        c1.eatAnimal(h1);
    }
    
    
}
