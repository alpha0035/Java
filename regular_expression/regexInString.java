package regular_expression;

import java.util.Scanner;

public class regexInString {
    public static void main(String[] args) {
        String regex= "\\w\\d-\\w\\d";
        // error wont complie if \w\d-\w\d
        Scanner sc= new Scanner(System.in);
        while (true) {
            String str= sc.nextLine();
            if(str.length()==0) break;
            if(str.matches(regex)) System.out.println("Match"); 
            else System.out.println("Does not match");
        }
        sc.close();
    }
}
