/*
 */
package animali;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristoforo Graf
 */
public class Carnivorous extends Animal implements ICarnivorous
{

    public Carnivorous(String name, String species, String noise) throws Exception
    {
        super(name, species, noise);
    }
    

    @Override
    public void eatAnimal(Animal animal)
    {
        if(!(animal instanceof Herbivore))
        {
            try
            {
                throw new Exception("Carnivorous cannot eat carnivorous");
            } 
            catch (Exception ex)
            {
                Logger.getLogger(Carnivorous.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
