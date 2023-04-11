package inheritance.hospital;

public class Doctor extends Person {

    private String specilist;
    private int salary;

    public Doctor(int id, String name, String gender, String specilist, int salary) {
        super(id, name, gender);

        this.specilist = specilist;
        this.salary = salary;
    }

    public Doctor(String specilist, int salary) {

        this.specilist = specilist;
        this.salary = salary;
    }

    public void setspecilist(String specilist) {
        this.specilist = specilist;
    }

    public String getspecilist() {
        return specilist;
    }

    public void setsalary(int salary) {

        this.salary = salary;
    }

    public int getsalary() {
        return salary;
    }

    public void diagnose() {

        System.out.println("\n___Doctors diagnose the disease of patients___");

    }

    public void treat() {
        System.out.println("\n___Doctors treat patients___");
    }

}
