package regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class patternAndMatcher {
    static Scanner sc= new Scanner(System.in);
    static Pattern pattern;
    static Matcher matcher;
    public static void main(String[] args) {
        String reg, str;
        boolean step1= false;
        boolean step2= false;
        boolean step3= false;
        do {
            do {
                System.out.print("Enter your regex: ");
                reg= sc.nextLine();
                try {
                    pattern= Pattern.compile(reg);
                    step1=true;
                } catch (PatternSyntaxException e) {
                    e.getMessage();
                    step1= false;
                }
            } while (!step1);
            do {
                System.out.println("Enter your string test: ");
                str= sc.nextLine();
                if(str.length()==0) step2=true;
                else{
                    step2=false;
                    matcher= pattern.matcher(str);
                    if(matcher.matches()) System.out.println("Match");
                    else System.out.println("Does not match");
                }
            } while (!step2);
            step3= askDone();
        } while (!step3);
    }
    private static boolean askDone(){
        System.out.print("Do you want to continue?(Y or N)");
        String s= sc.nextLine();
        if(s.equals("Y")) return false;
        else return true;
    }
}
/*
 * Pattern class help you excute regex, first you use complie method to create Pattern obj
 * then you use matcher method to create Matcher obj
 */

 /*
  * Matcher class contain many methods help you to work with regex
  */