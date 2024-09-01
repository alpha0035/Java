package generic_collection;

public class creating {
    public static void main(String[] args) {
        // parameter type must be Class type
        Car<Integer> obj= new Car<>(3, 4);
        System.out.println(obj.getAlpha()+" "+obj.getBeta());
    }
}

// generic let you create a class that can be use for any type specified
class Car<E>{
    private E alpha, beta;
    public Car(E x, E y){
        alpha= x;
        beta= y;
    }
    public E getAlpha() {
        return alpha;
    }
    public E getBeta() {
        return beta;
    }
    
}