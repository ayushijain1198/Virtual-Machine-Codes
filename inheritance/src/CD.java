public class CD {
private int cdId;
private String cdName;
private int publishedYear;
public CD(){

}
public CD(int cdId, String cdName, int publishedYear){
    this.cdId=cdId;
    this.cdName=cdName;
    this.publishedYear=publishedYear;

}
public String getDetails(){
    return "CD-ID:"+cdId+"CD Name:"+cdName+"year:"+publishedYear;

}
}
