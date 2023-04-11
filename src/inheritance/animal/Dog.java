package inheritance.animal;

public class Dog extends Animal {

    private String breed;

    Dog() {
        super();
        this.breed = "Husky";
    }

    Dog(String breed) {
        this.breed = breed;
    }

    Dog(String breed, String name, String color) {
        super(name, color);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("bhow bhow");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
