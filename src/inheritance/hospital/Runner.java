package inheritance.hospital;

public class Runner {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(02, "Hina", "Female", "Physician", 50000);
        doctor.diagnose();
        Patient patient = new Patient(05, "Sadi", "Female", "Fever");
        patient.appointDoctors();
    }
}
