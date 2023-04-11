package abstraction;

// class: Real world entity / Single(attributes,constructors,getter/seters,functions);
// obj: Represents the class;
// Functionality hinderance=>hide the functions(abstract functions/concrete functions);

abstract class Animal {

    public abstract void sound();

    void method2() {
        System.out.println("This is regular method");
    }

}

class Dog extends Animal {

    public void sound() {
        System.out.println("Dog sounds like Woof");
        super.method2();
    }

}

class Cat extends Animal {

    public void sound() {
        System.out.println("Dog sounds like Meow");
    }

}

class Wolf extends Animal {

    public void sound() {
        System.out.println("Dog sounds like Wulf");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        Animal cat = new Cat();
        cat.sound();
        Animal wolf = new Wolf();
        wolf.sound();
    }
}
