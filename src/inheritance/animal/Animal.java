package inheritance.animal;
// attributes parents => extends children

// used to get common functionalities in different classes(functions,attributes,constructor)
// to acces parent class's data  => sper keyword is used
public class Animal {

    private String name;
    private String color;

    Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eating() {
        System.out.println("I am Eating");
    }

    public void sleeping() {
        System.out.println("I am Sleeping");
    }

    public void walking() {
        System.out.println("I am Walking");
    }

}
