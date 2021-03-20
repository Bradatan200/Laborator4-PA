package lab4;
import java.util.ArrayList;
import java.util.List;


public class School implements Comparable<School>
{
    String name;
    int capacity;
    
    public School(String name)
    {
        this.name = name;
    }
    public School(String name, int capacity)
    {
        this.name = name;
        this.capacity = capacity;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
    public int getCapacity()
    {
        return capacity;
    }
    @Override
    public String toString()
    {
        return name;
    }
    @Override
    public int compareTo(School o) 
    {
       return this.getName().compareTo(o.getName());
    }
}
