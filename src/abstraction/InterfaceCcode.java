package abstraction;

// ...................................Interface.............................
//    => abstract/interface class is like a template
//    => concrete class is required to perform the body action of an abstract class
// no define,

interface Student {

    String name = " ";

    public void giveExams();
}

class Doctor implements Student {

    public void giveExams() {
        System.out.println("Students give Exams");
    }

}

public class InterfaceCcode {
    public static void main(String[] args) {

        Student exams = new Doctor();
        exams.giveExams();

    }
}
