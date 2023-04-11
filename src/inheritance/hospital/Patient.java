package inheritance.hospital;

public class Patient extends Person {

    private String disease;

    public Patient(int id, String name, String gender, String disease) {
        super(id, name, gender);

        this.disease = disease;
    }

    public Patient(int id, String name, String disease) {

        this.disease = disease;
    }

    public void setdisease(String disease) {
        this.disease = disease;
    }

    public String getdisease() {
        return disease;
    }

    public void appointDoctors() {
        System.out.println("\n___Patients take appointment of a doctor for treatment___");
    }

    public void taketherapy() {
        System.out.println("\n___Patients take the therapy for treatment of a disease___");
    }

}
