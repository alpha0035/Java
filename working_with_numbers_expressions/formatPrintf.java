package working_with_numbers_expressions;

import java.util.Scanner;

public class formatPrintf {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int a= 123;
        double b = sc.nextDouble();
        char c= 'c';
        String s = "hello world.";
        // here we use printf method
        System.out.printf("%,d\n", a);
        System.out.printf("%5.3f\n", b);
        System.out.printf("%c\n%C\n", c,c);
        System.out.printf("%s\n%S\n", s, s);
        // left justified
        System.out.printf("%-10d%f\n", a, b);
        //pad output with zeroes
        System.out.printf("%05d", a);
    }
}
