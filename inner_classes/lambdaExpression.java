package inner_classes;

import java.util.Scanner;

import abstract_classes_interfaces.interfaces;
import inner_classes.anonClass.Ball;

// lambda expression let you create anonymous class with special interface which just have one abstract method
// note that you can have more default methods
// general syntax for lambda expression is:
// (parameters)->   expression
// (parameters)-> {statement;}
public class lambdaExpression {
    public static void main(String[] args) {
        One.run();
        Two.run();
    }
}

class One{
    public static void run(){
        Baseball b= () -> {System.out.println("You hit it!");};
        b.hit();
    }
    interface Baseball{
        void hit();
    }
}

class Two{
    public static void run(){
        Scanner sc= new Scanner(System.in);
        Badminton b= (y)->
            {   
                y/=2;
                System.out.println(Math.pow(y, y));
            };
        b.start(sc.nextInt());
    }
    interface Badminton{
        default void hit(){
            System.out.println("You hit!");
        }
        void start(int y);
    }
}