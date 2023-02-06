public class Vehicle {

    private String model;
    private String speed;


    public Vehicle() {
        super();
    }


    public Vehicle(String model, String speed) {
        super();
        this.model = model;
        this.speed = speed;
    }


    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpeed() {
        return this.speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }



}