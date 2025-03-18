package src.problem1;

public class Student extends Person{
    protected String myIdNum;
    protected double myGPA;

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        this.myIdNum = idNum;
        setGPA(gpa); 
    }

    public void setGPA(double gpa) {
        if (gpa >= 0 && gpa <= 4) this.myGPA = gpa;
        else throw new IllegalArgumentException("GPA must be between 0 and 4.");
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
    
}
