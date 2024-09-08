package bigdecimal;

import java.text.NumberFormat;

public class seeProblem {
    public static void main(String[] args) {
        /*You will see the problem here that result of ten_pennies is 0.999999999999999, not 0.1
         * This occur because Java store doble in base 2 (not base 10)
         */
        addFunc();
        Check();
    }
    private static void addFunc(){
        double dime= 0.1;
        double penny= 0.01;
        double ten_pennies=0;
        for (int i = 0; i < 10; i++) {
            ten_pennies+= penny;
        }
        System.out.println("One dime is: "+dime);
        System.out.println("Ten pennies is: "+ten_pennies);
        if(dime==ten_pennies) System.out.println("They are equal.");
        else System.out.println("They are not equal.");
    }
    // in most case, we don't notice this problem because they are often hidden by rounding
    // you can see problem by using NumberFormat class to format a number with ten significant digits
    private static void Check(){
        float s= 0.1f;
        System.out.println(s);
        NumberFormat nf= NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(10);
        System.out.println(nf.format(s));
    }
}
