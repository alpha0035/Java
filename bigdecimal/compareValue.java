package bigdecimal;

import java.math.BigDecimal;

public class compareValue {
    public static void main(String[] args) {
        BigDecimal num1, num2;
        num1= new BigDecimal("1.00");
        num2= new BigDecimal("1.0000");
        // return -1 if is less than, 0 if equal to and 1 if greater than
        if(num1.compareTo(num2)==0) System.out.println("They are the same");
        else System.out.println("They are different");
    }
}
