package comm.example;

public class SpecialEditionCD extends CD {
    private String speciality;

    public SpecialEditionCD(String speciality) {
        this.speciality = speciality;

    }

    @Override
    public void createNewCD(int id, String n, String dor) {
        super.createNewCD(id, n, dor);
    }

    @Override
    public String displayDetails() {
        super.displayDetails();
        return "Speciality is: " + speciality;

    }

}
