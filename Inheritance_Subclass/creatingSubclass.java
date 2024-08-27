package Inheritance_Subclass;

/* class Derived-Class extends Base-Class{ 
    ... class body
}*/

public class creatingSubclass {
    public static void main(String[] args) {
        
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
class BaseBall extends Ball{
    public String getShape(){
        return shape;
    }
}