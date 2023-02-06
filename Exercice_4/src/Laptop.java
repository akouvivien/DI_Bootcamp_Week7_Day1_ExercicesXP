public class Laptop  extends Computer{

private String  type;

    public Laptop(String type, String marque, String horloge, String ram) {
        super(marque, horloge, ram);
        this.type = type;
    }
    
    

    /**
     * @return String return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    public   String type(){
        return "{" +
        " type=" + getType() +
        "}";
    }



}