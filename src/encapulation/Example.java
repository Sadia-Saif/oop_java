package encapulation;

class Student {
    private int id;
    private String name;
    private double rollNo;

    Student() {
        this.id = 0;
        this.name = " Sadia ";
        // this.rollNo = 0;
    }

    Student(int id) {
        this.id = id;
        this.name = "Mariyam";
        this.rollNo = 02;
    }

    Student(int id, String name, double rollNo) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setRollNo(double rollNo) {
        this.rollNo = rollNo;
    }

    public double getRollNo() {
        return this.rollNo;
    }
}

public class Example {
    public static void main(String[] args) {

        Student student = new Student(1, "Sadia", 02);

        // student.setId(1);
        // student.setName("Sadia");
        // student.setRollNo(06);

        int id = student.getId();
        String name = student.getName();
        double RollNo = student.getRollNo();

        System.out
                .println("\nYour id is: " + id + " " + "\nYour name is: " + " " + name + "\nYour RollNo is: " + " "
                        + RollNo);

    }
}
