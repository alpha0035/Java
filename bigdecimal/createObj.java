package bigdecimal;

import java.math.BigDecimal;

public class createObj {
    public static void main(String[] args) {
        BigDecimal num1= new BigDecimal(0.01);
        System.out.println(num1);
        // the ouput still have wrong answer 0.01000000000000000020816681711721685132943093776702880859375
        // here the best way to create is via a String
        BigDecimal num2= new BigDecimal("0.01");
        System.out.println(num2);

    }
}
