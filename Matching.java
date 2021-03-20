package lab4;

public class Matching 
{

    private Student student;
    private School school;
    
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
    
    public Matching(Student student, School school)
    {
        this.student = student;
        this.school = school;
    }
    
}
