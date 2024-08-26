package making_classes;

/**
 * declareClass
 */
public class declareClass {

    public static void main(String[] args) {
        Car obj= new Car();
        obj.Greeting();
    }
}

class Car{
    public void Greeting(){System.out.println("This is Car class!");}
}