public class SmartPhone  extends Computer{

    private String  ecran;

    public SmartPhone(String ecran, String marque, String horloge, String ram) {
        super(marque, horloge, ram);
        this.ecran = ecran;
    }

    

    /**
     * @return String return the ecran
     */
    public String getEcran() {
        return ecran;
    }

    /**
     * @param ecran the ecran to set
     */
    public void setEcran(String ecran) {
        this.ecran = ecran;
    }

    public   String ecran(){
        return "{" +
        " ecran=" + getEcran() +
        "}";
    }



}