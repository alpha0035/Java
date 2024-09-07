package object_and_class;
/*object class is mother of all classes in Java. It means that all classes in Java must be inherit from Object class.
 * But you don't have to use extends keyword to inherit
 * You can code like the following but it's not nescessary:
 *   class Alpha extends Object{...}
 */
public class objectClass {
    public static void main(String[] args) {
        Object alp= new Alpha1();
        ((Alpha1) alp).setStr("Alpha1");
        System.out.println(((Alpha1)alp).getStr());

    }
}
 class Alpha1{
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
 }