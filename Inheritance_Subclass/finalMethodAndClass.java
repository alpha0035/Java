package Inheritance_Subclass;
// final methods are methods which can't be overridden by other methods in subclasses
// final classes are classes which can't be use as a baseclass
public class finalMethodAndClass {
    public static void main(String[] args) {
        
    }
}
final class Time{
    public final void greeting(){System.out.println("this is Time class.");}
}
// class Minute extends Time{}: this won't complie
class Car{
    public final void greeting(){System.out.println("This is Car class");}
}
class Speed extends Car{
    //public void greeting(){} : this will not complie
}