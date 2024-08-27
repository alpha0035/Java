package working_with_static;
/*Singleton is a class that you can create just one instance */
/* To prevent creating more than one instance, we use static int var to count the number of instances the class has 
 * and declare private to all constructors
*/
public class singleton {
    public static void main(String[] args) {
        Innersingleton ob1= Innersingleton.getInstance();
        Innersingleton ob2= Innersingleton.getInstance();
        if(ob1==ob2) System.out.println("true");
        else System.out.println("false");
    }
}

/**
 * Innersingleton
 */
class Innersingleton {
    static private int count=0;
    static Innersingleton obj;
    private Innersingleton(){};
    public static Innersingleton getInstance(){
        if(count>=1) return obj;
        else{
            obj= new Innersingleton();
            count++;
            return obj;
        }
    }
}
