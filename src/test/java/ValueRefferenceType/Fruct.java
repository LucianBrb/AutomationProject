package ValueRefferenceType;

public class Fruct {

    public String descriere;
    public String sezon;

    public Fruct(String descriere, String sezon) {
        this.descriere = descriere;
        this.sezon = sezon;
    }

    public void descriere(){
        System.out.println(descriere);
        System.out.println(sezon);
    }


}
