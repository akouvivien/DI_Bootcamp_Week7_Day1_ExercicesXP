public class App {
    public static void main(String[] args) throws Exception {
        Car  car = new Car("Roadster");
        car.setSpeed("200");
        car.setModel("Tesla");
        System.out.println(car.getDetails("Roadster"));
    }
}
