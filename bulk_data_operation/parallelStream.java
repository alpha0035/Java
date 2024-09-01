package bulk_data_operation;

import java.util.ArrayList;

public class parallelStream {
    public static void main(String[] args) {
        ArrayList<Bar> arr= new ArrayList<>();
        arr.add(new Bar((int)(Math.random()*9+1), Math.random(), "One"));
        arr.add(new Bar((int)(Math.random()*9+1), Math.random(), "Two"));
        arr.add(new Bar((int)(Math.random()*9+1), Math.random(), "Three"));
        arr.add(new Bar((int)(Math.random()*9+1), Math.random(), "Four"));
        arr.add(new Bar((int)(Math.random()*9+1), Math.random(), "Five"));
        
        // using parallelStream method
        arr.parallelStream().forEach(s->System.out.println(s));
    }
}
class Bar{
    private int x;
    private double y;
    private String str;
    public Bar(int a, double b, String tmp){
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