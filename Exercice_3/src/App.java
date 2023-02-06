public class App {
    public static void main(String[] args) throws Exception {
        Vehicle vehicle = new Vehicle( "tesla", "100");
        Car  car = new Car("Roadster");
        car.setSpeed("200");
        car.setModel("Tesla");
        System.out.println(car.getDetails("Roadster"));
    }
}
