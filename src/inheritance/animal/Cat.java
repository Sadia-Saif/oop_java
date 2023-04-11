package inheritance.animal;

public class Cat extends Animal {
    private int age;

    public Cat(String name, String color, int age) {
        super(name, color);
        this.age = age;
    }

    public Cat(int age) {
        this.age = age;
    }

    public void meow() {
        System.out.println("Meow Meow");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
