package working_with_numbers_expressions;

public class incrementAndDecrement {
    public static void main(String[] args) {
        // you can use only on variables, not numeric and other expression
        // a= b*5++; a=(b*5)++;     this will come to an error
        int a=10;
        int b=a--;
        // b is set to 10 then a decrease by 1
        System.err.println(a+" "+b);
        int c= --a;
        // both a and c are set to 8
        System.out.println(a+" "+c);
        int d= a*b--;
        // equal to a*b then b decrease by 1
        System.out.println(b+" "+d);
        a += 10;
        // equal to a = a+10;
        System.out.println(a);
        a *= b+1;
        // equal to a= a*(b+1);
        System.out.println(a);
    }
}
