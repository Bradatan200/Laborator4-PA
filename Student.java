package lab4;


public class Student 
{
    String name;
    
    public Student(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    @Override
    public String toString()
    {
        return name;
    }
}
