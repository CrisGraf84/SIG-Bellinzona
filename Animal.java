/*
 */
package animali;

/**
 *
 * @author Cristoforo Graf
 */
public class Animal
{
    private String name;
    private String species;
    private String noise;

    public Animal(String name, String species, String noise) throws Exception
    {
        if(isEmpty(name) || isEmpty(species))
        {
            throw new Exception ("Animal Name or Animal species cannot be empty");
        }
        this.name = name;
        this.species = species;
        this.noise = noise;
    }

    public void setName(String name) throws Exception
    {
        if(isEmpty(name))
        {
            throw new Exception ("Animal Name or Animal species cannot be empty");
        }        
        this.name = name;
    }

    public void setSpecies(String species) throws Exception
    {
        if(isEmpty(species))
        {
            throw new Exception ("Animal Name or Animal species cannot be empty");
        } 
        this.species = species;
    }

    public void setNoise(String noise)
    {
        this.noise = noise;
    }

    public String getName()
    {
        return this.name;
    }

    public String getSpecies()
    {
        return this.species;
    }

    public String getNoise()
    {
        return this.noise;
    }
    
    private boolean isEmpty(String string)
    {
        return string.isBlank() || string.isEmpty();        
    }

    @Override
    public String toString()
    {
        return "Animal name: " + name + ", Animal species=" + species + ", Animal noise=" + noise + '}';
    }

    
}
