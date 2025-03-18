package src.problem1;

public class CollegeStudent extends Student {
    private String major;
    private int year;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        setYear(year);
        this.major = major;
    }

    public void setYear(int year) {
        if (year >= 1 && year <= 4) this.year = year;
        else throw new IllegalArgumentException("Year must be between 1 and 4.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
}
