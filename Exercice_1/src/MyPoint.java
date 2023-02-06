public class MyPoint {

    private  int x = 0;
    private  int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
    // initialisation  et instanciation 
    public  int[] getXY(){
        return new int[] {this.x,this.y};
    }

    public  void setXY(int x, int y){
        this.x = x;
        this.y = y;
        }


    @Override
    public String toString() {
        return "{" +
            " x='" + getX() + "'" +
            ", y='" + getY() + "'" +
            "}";
    }

// distance en prenant en compte les coordonnées  entrez en parametre du constructeur
    public double distance(int x, int y){
        return Math.sqrt(Math.pow((this.x-x), 2)+Math.pow((this.y-y), 2));
    }


// distance en prenant en compte un objet de type 
    public double distance(MyPoint point){
        return Math.sqrt(Math.pow((this.x-point.getX()), 2)+Math.pow((this.y-point.getY()), 2));
    }
    

// distance par defaut
    public double distance(){
        return Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2));
    }

}