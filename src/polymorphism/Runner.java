package polymorphism;

// overloading => same class name ,attributes or data-type different
// overriding => needs parent class, use @override keyword

class Person {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showProfile() {
        System.out.println("ID: " + this.id + "\nname: " + this.name);
    }

}

class Student extends Person {

    private String majors;

    public Student(int id, String name, String majors) {
        super(id, name);
        this.majors = majors;
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int addition(int a, int b, int c) {
        return a + b + c;
    }

    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public void showProfile() {
        System.out.println("\nID: " + super.getId() + "\nname: " + super.getName() + "\nmajors: " + this.majors);
    }

}

public class Runner {
    public static void main(String[] args) {
        Student student = new Student(02, "Sadi", "English");
        student.addition(10, 20);
        student.showProfile();
    }
}
