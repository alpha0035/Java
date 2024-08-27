package making_classes;

public class createConstructor {
    public static void main(String[] args) {
        Car obj = new Car(3, 4);
        System.out.println(obj.getNumber());
    }
}

class Car{
    private float number;
    private int type;
    public Car(){}
    public Car(float x){
        number= x;
    }
    public Car(float x, int y){
        number= x;
        type= y;
    }
    public void Greeting(){System.out.println("This is Car class!");}
    public float getNumber(){return number;}
    public int getType(){return type;}
}