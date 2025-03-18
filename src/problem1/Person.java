package src.problem1;

public class Person {
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String name, int age, String gender) {
        this.myName = name;
        this.myAge = (age >= 0) ? age : 0;  
        this.myGender = gender;
    }

    public String getName() { return myName; }
    public int getAge() { return myAge; }
    public String getGender() { return myGender; }

    public void setAge(int age) { 
        if (age >= 0) this.myAge = age; 
    }

    @Override
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
    
}
