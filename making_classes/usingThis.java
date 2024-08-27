package making_classes;

public class usingThis {
    public static void main(String args[]) {
        Bar obj= new Bar(3.4, 6);
        System.out.println(obj.getType());
    } 
}
 
class Bar{
    private double number;
    private int type;
    public Bar(){}
    public Bar(double x){
        number= x;
    }
    public Bar(double x, int y){
        this(x);
        this.type= y;
    }
    public void Greeting(){System.out.println("This is Car class!");}
    public double getNumber(){return number;}
    public int getType(){return type;}
}