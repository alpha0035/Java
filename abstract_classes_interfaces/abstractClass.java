package abstract_classes_interfaces;
// an abstract class can be used only if you subclass it
public class abstractClass {
    public static void main(String[] args) {
        //abstract class can't be instantiated
        // Alpha obj = new Alpha()  This will not complie
        Beta obj= new Beta();
        System.out.println(obj.power(3));
    }
}

abstract class Alpha{
    public abstract int power(int a);
    //private methods can't be astract
    // private abstract void greeting(){System.out.println("this is alpha.");}
}
// you can create subclass like this
class Beta extends Alpha{
    public int power(int x){
        return x*20;
    }
}