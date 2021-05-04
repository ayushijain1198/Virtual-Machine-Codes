public class SpecialEditionCD extends CD{
    private String speciality;
    public SpecialEditionCD(){
        super();
    }
    public SpecialEditionCD(int cdId, String cdName, int publishedYear, String speciality){
        super(cdId,cdName,publishedYear);
        this.speciality=speciality;

    }

    @Override
    public String getDetails() {
        return super.getDetails()+"Speciality: "+speciality;
    }
}
