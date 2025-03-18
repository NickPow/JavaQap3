package src.problem1;

public class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        setSalary(salary);
    }

    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
        else throw new IllegalArgumentException("Salary cannot be negative.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Salary: $" + salary;
    }
    
}
