package making_classes;
/*Initializers block are excuted whenever the instances of class are created*/

import java.util.Scanner;

public class useInitializer {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        boolean a= scn.nextBoolean();
        if(a){
            InneruseInitializer obj= new InneruseInitializer();
            System.out.println(obj.getX()+" "+obj.getY());
        }else System.out.print("Nothing happened!");
        scn.close();
    }
}

/**
 * InneruseInitializer
 */
class InneruseInitializer {
    private Scanner sc= new Scanner(System.in);
    private int x;
    {
        System.out.print("Enter x number: ");
        x= sc.nextInt();
    }
    // same effect
    private int y= getInt();
    private int getInt(){
        System.out.print("Enter an integer: ");
        return sc.nextInt();
    }
    public int getX(){return x;}
    public int getY(){return y;}
}