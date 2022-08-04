public class Student {

    private int rollNumber;
    private String name;

    public Student (String name, int rollNumber) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public int getRollNumber () {
        return rollNumber;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setRollNumbe (int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
