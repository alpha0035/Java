package working_with_static;

import java.util.Scanner;

public class staticFields {
    private static Scanner sc= new Scanner(System.in);
    static private int x=0;
    // same effect
    public static void main(String[] args) {
        int y=0;
        for (int i = 0; i < 5; i++) {
            print();
        }
    }
    private static void print(){
        System.out.printf("%d", x);
        x+=1;
    }
}
