package bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class roundValue {
    public static void main(String[] args) {
        BigDecimal num1, num2;
        num1= new BigDecimal("0.018");
        // here the scale of BigDecimal number is the number of digits appear to the right of decimal point
        System.out.println("The scale of 0.018 is "+num1.scale());
        // you can use setScale method to round
        num2= num1.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Round half-up to 2 decimal places of 0.018 is "+num2);
        num2= num1.setScale(2, RoundingMode.HALF_DOWN);
        System.out.println("Round half-down to 2 decimal places of 0.018 is "+ num2);
    }
}