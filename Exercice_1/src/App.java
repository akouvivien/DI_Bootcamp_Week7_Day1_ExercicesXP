public class App {
    public static void main(String[] args) throws Exception {
       //distance  entre  un objet de type (x,y) et un autre point mis en parametre
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1.distance(5, 6));
        //coordonnée de p1 a l'etat initial
        System.out.println(p1.distance());

        //distance entre deus objets
        MyPoint p2 = new MyPoint(5, 8);
        System.out.println(p2);
        System.out.println(p1.distance(p2));
    }
}
