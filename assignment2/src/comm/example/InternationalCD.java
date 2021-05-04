package comm.example;

public class InternationalCD extends CD{
    private String language;

    public InternationalCD(String language) {
        this.language= language;

    }

    @Override
    public void createNewCD(int id, String n, String dor) {
        super.createNewCD(id, n, dor);
    }

    @Override
    public String displayDetails() {
        super.displayDetails();
        return "Language is: " + language;
    }
}
