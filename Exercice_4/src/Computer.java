public class Computer {

    private String marque;
    private String horloge;
    private String ram;


    public Computer(String marque, String horloge, String ram) {
        this.marque = marque;
        this.horloge = horloge;
        this.ram = ram;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getHorloge() {
        return this.horloge;
    }

    public void setHorloge(String horloge) {
        this.horloge = horloge;
    }

    public String getRam() {
        return this.ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }


   public   String display(){
        return "{" +
        " marque='" + getMarque() + "'" +
        ", horloge='" + getHorloge() + "'" +
        ", ram='" + getRam() + "'" +
        "}";
    }

    public   String horloge(){
        return "{" +
        ", horloge='" + getHorloge() +
        "}";
    }


    
}