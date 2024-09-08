package bigdecimal;

import java.math.BigDecimal;

// the worst part is that you can't use arithmetic operator 
// instead, you have to call some methods
public class doArithmetic {
    public static void main(String[] args) {
        BigDecimal num1= new BigDecimal("0.32");
        BigDecimal num2= new BigDecimal("0.46");
        BigDecimal num3;
        // num3= num1 + num2  this will not complie
        num3= num1.add(num2);
        System.out.println(num1+"+ "+num2+"= "+num3);
    }
}
