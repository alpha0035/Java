package Inheritance_Subclass;


public class usingThis_Super {
    public static void main(String[] args) {
        BaseBall obj= new BaseBall();
        System.out.println(obj.getShape());
    }
}
class Ball{
    private double radix;
    protected String shape= "Circle";
    public int type;
    public Ball(){};
    public Ball(double a, int b){
        radix= a;
        type= b;
    }
    public double getRadix(){
        return radix;
    }
}
// subclass doesn't inherit constructors and private member of superclass
// super keyword works like this but it refers to an instance of baseclass
class BaseBall extends Ball{
    public String getShape(){
        return shape;
    }
    
}