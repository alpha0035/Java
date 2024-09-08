package bigdecimal;

import java.math.BigDecimal;
import java.text.NumberFormat;
// in most case, the only reason for converting BigDecimal to other type is to use NumberFormat class
public class convert {
    public static void main(String[] args) {
        BigDecimal num= new BigDecimal("1.2345");
        double x= num.doubleValue();
        NumberFormat nf= NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(x));
    }
}
