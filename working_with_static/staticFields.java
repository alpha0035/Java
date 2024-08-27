package working_with_static;

import java.util.Scanner;

public class staticFields {
    private static Scanner sc= new Scanner(System.in);
    static private int x=1;
    // same effect
    public static void main(String[] args) {
        int y=0;
        staticFields obj= new staticFields();
        for (int i = 0; i < 5; i++) {
            obj.print();
        }
    }
    private void print(){
        System.out.printf("%d", x);
        x+=1;
    }
}
