package working_with_numbers_expressions;

import java.util.*;
import java.util.Scanner;

public class throwException {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("You got ArithmeticException!");
        }
        finally{System.out.println("End step 1!");}

        try{
            mutiple();
        }
        catch(InputMismatchException e){
            System.out.println("You got InputMismatchException!");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    // throw an exception from method
    private static void divide()
    throws ArithmeticException{
        int a= sc.nextInt(), b= sc.nextInt(), c;
        c= a/b;
        System.out.println(c);
    }

    // you can also throw own exception
    private static void mutiple()
    throws ArithmeticException, InputMismatchException, Exception{
        int a= sc.nextInt(), b= sc.nextInt(), c;
        // here you create your own exception, for example, if a or b is negative will return ArithmeticException
        if(a<0 || b<0){
            throw new ArithmeticException("a or b should not be negative");
        }
        else if(a==0 || b==0) throw new Exception(/*Write your description here */);
    }
}
