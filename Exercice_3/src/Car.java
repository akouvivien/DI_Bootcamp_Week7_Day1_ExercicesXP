class Car extends Vehicle {

    //  Name of a Car
    private String carName;
  
    // Default Constructor
    public Car() {
  
    }

    public Car(String string) {
        this.carName = carName;
    }

    public String getCarName() {
        return this.carName;
    }

  
    // This function sets the name of the car
    public void setDetails(String name) { // Setter Function
        this.carName = carName;
    }
  
    // This function calls the Base class functions and appends the result with the input
    public String getDetails(String carName) {
        return "{" +
        " carName='" + carName + " Model='"  +getModel()+" Speed='"+getSpeed()+
        "}";
    }

  }