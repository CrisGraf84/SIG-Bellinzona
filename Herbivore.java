/*
 */
package animali;

/**
 *
 * @author Cristoforo Graf
 */
public class Herbivore extends Animal implements IHerbivore
{

    public Herbivore(String name, String species, String noise) throws Exception
    {
        super(name, species, noise);
    }

    @Override
    public void eatGrass(){}
    
    
}
