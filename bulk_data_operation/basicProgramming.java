package bulk_data_operation;

import java.util.ArrayList;

public class basicProgramming {
    public static void main(String[] args) {
        ArrayList<Car> arr= new ArrayList<>();
        arr.add(new Car((int)(Math.random()*9+1), Math.random(), "One"));
        arr.add(new Car((int)(Math.random()*9+1), Math.random(), "Two"));
        arr.add(new Car((int)(Math.random()*9+1), Math.random(), "Three"));
        arr.add(new Car((int)(Math.random()*9+1), Math.random(), "Four"));
        arr.add(new Car((int)(Math.random()*9+1), Math.random(), "Five"));
        for(Car obj: arr){
            System.out.println(obj.toString());
        }
        System.out.println();
        // the equivalent code using stream
        arr.stream().forEach(s->System.out.println(s));
        System.out.println();
        // if you just want to print Car obj with x=1
        for(Car obj: arr){
            if(obj.getX()== 1) System.out.println(obj.toString());
        }
        arr.stream().filter(x-> x.getX()==1).forEach(x-> System.out.println(x));
    }
}

class Car{
    private int x;
    private double y;
    private String str;
    public Car(int a, double b, String tmp){
        x= a;
        y= b;
        str= tmp;
    }
    @Override
    public String toString() {
        return "Car [x=" + x + ", y=" + y + ", str=" + str + "]";
    }
    public int getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public String getStr() {
        return str;
    }
    

}