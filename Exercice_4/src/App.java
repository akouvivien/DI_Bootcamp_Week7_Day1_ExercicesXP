public class App {
    public static void main(String[] args) throws Exception {
         Laptop laptop = new Laptop("tactille", "hp", "3 GHZ", "8 GO");
         SmartPhone smartPhone = new SmartPhone("6", "Xiaomi", "2GHZ", "6GO");
         System.out.println(laptop.type());
         System.out.println(smartPhone.ecran());
    }
}
