package working_with_numbers_expressions;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// here FormatNumber class provides some methods to formatting your number output
public class formattingNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float x =  sc.nextFloat();
        NumberFormat nf1= NumberFormat.getNumberInstance();     // return object formats basic numbers
        NumberFormat nf2= NumberFormat.getCurrencyInstance(Locale.CHINA);   // return object formats currency values
        NumberFormat nf3= NumberFormat.getPercentInstance();    // return object formats percentages
        // you must use format method to return a String contain formatted number
        System.out.println(x+" in china currency "+nf2.format(x));
        System.out.println(x+" in percentage "+nf3.format(x));

        nf1.setMaximumFractionDigits(5);    // set the maximum number of digits to display to the right of decimal point
        nf2.setMinimumFractionDigits(2);    // set the minimum number of digits to display to the right of decimal point
        System.out.println(nf1.format(x));
        sc.close();
    }
}
