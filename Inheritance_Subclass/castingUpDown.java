import java.util.*;;
public class castingUpDown {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        Alpha aobj= new Beta();
        // here a new object of Beta class is created, then a reference to this object is assigned to aobj variable
        // thus, aobj's type is Alpha, not Beta
        Alpha obj= toss();
        System.out.println(obj.getX());
        //print(obj);  this will not complie
        print((Beta)obj); //downcasting
        /*so now you know the way how to use methods in Subclass from Superclass obj */
        int y= ((Beta) aobj).getY();
        System.out.println(y);
    }
    private static Beta toss(){
        Beta obj= new Beta();
        obj.setX(5);
        return obj;        
    }
    private static void print(Beta obj){
        System.out.println(obj.getY());
    }
}

/* if a subclass extends from a superclass, 
then the subclass object can be treated as though it were a superclass object (upcasting)
So java does it automatically
Superclass-Name obj= new Subclass-Name()*/

/*You can't use Superclass object where Subclass object is called for */
class Alpha{
    private static int x;
    public Alpha(){System.out.println("this is constructor from Alpha class.");}
    public static int getX() {
        return x;
    }
    public static void setX(int x) {
        Alpha.x = x;
    }
    
    
}
class Beta extends Alpha{
    private static int y;
    public Beta(){System.out.println("this is constructor from Beta class.");}
    public static int getY() {
        return y;
    }    
}