package working_with_static;

import java.util.Scanner;

public class staticInitializers {
    public static void main(String[] args) {
        InnerstaticInitializers obj1= new InnerstaticInitializers();
        InnerstaticInitializers obj2= new InnerstaticInitializers();
    }
}

/**
 * InnerstaticInitializers
 */
class InnerstaticInitializers {
    public static int x;
    static{
        Scanner sc= new Scanner(System.in);
        x= sc.nextInt();
    }
}