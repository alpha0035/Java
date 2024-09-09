package working_with_variables_datatypes;

import java.util.Scanner;

public class inputWithScanner {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        int x;
        float y;
        String s;
        x= sc.nextInt();
        System.out.println("The integer number you entered is "+ x);
        System.out.print("Enter a float: ");
        y= sc.nextFloat();
        System.out.println("The float number you entered is "+y);
        System.out.print("Enter a string: ");
        s = sc.next();
        System.out.println("The string you entered is " + s);
    }
}
