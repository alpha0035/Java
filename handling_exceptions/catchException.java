package handling_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class catchException {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x;
        try {
            x= sc.nextInt();
            System.out.println(x);
        }
        catch (Exception e) {
            System.out.print("Please enter right integer!");
        }
        sc.close();
    }
}
