package working_with_numbers_expressions;
// Math class contain some methods and constant values for computing math
// two constant value is PI and E

import java.util.Scanner;

public class mathClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float x= sc.nextFloat(), y= sc.nextFloat();
        System.out.println("abs(x)= "+Math.abs(x));     //return absolute value of arg
        System.out.println("sqrt(x)= "+Math.sqrt(x));   //return square root value of arg
        System.out.println("exp(x)= "+Math.exp(x));     //return e raised to power of arg 
        System.out.println("log(x)= "+Math.log(x));     //return natural logarithm of arg
        System.out.println("Random integer from x to y "+createRandom(x, y));
    }
    // One useful method in Math class is random than return a double number from 0 to under 1
    private static int createRandom(double start, double end){
        return (int) ((Math.random()*(end-start+1))+start);
    }
}
