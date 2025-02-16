//Write OOJP to define class Box which will consist default, parameterised as
//well as copy constructor and a method to calculate surface area of a boxes
public class Q_66 {
    private double  l;
    private double  w;
    private double  h;
    //Default Constructor
    public Q_66(){
        this.l = 1.0;
        this.w = 1.0;
        this.h = 1.0;
    }
    public Q_66(double l, double w, double h){ //Parameterized Constructor
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public Q_66(Q_66 other){ //Copy Constructor
        this.l = other.l;
        this.w = other.w;
        this.h = other.h;
    }
    public double getSurfaceArea(){
        return 2*(l*w + w*h + h*l);
    }
    @Override
    public String toString(){
        return "Box [length = " + l +", width = "+ w+", height = "+h+"]";
    }
    public static void main(String[] args) {
        Q_66 defaultbox = new Q_66();
        System.out.println("Default Box: "+ defaultbox);
        System.out.println("Surface Area: "+ defaultbox.getSurfaceArea());
        Q_66 parambox = new Q_66(3, 4, 5);
        System.out.println("Default Box: "+ parambox);
        System.out.println("Surface Area: "+ parambox.getSurfaceArea());
        Q_66 copybox = new Q_66(parambox);
        System.out.println("Default Box: "+ copybox);
        System.out.println("Surface Area: "+ copybox.getSurfaceArea());
    }
}
