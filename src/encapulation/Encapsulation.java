package encapulation;
// abstraction hide all implementation

// encapsulation hide data(private,public,protected)
// getter/setter
public class Encapsulation {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Runner {
    
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setName("Sadia");
        String name = encapsulation.getName();
        System.out.println(name);
    }
}
