package regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class customerCharactor {
        static String rg;
    static Scanner scn= new Scanner(System.in);
    static Matcher match;
    static Pattern pattern;
    public static void main(String[] args) {
        System.out.println("Welcome to Regex Test!");
        System.out.println("Enter your regex:  ");
        rg= scn.nextLine();
        pattern= Pattern.compile(rg);
        String str;
        boolean done= false;
        while (!done) {
            System.out.print("Enter your test word: ");
            str= scn.nextLine();
            if(str.length()==0){
                System.out.println("End the program!");
                break;
            }
            match= pattern.matcher(str);
            if(match.matches()) System.out.println("Match");
            else System.out.println("Does not match");
        }
    }
}
/*
 * customer matching    b[aoi]t 
 * using range          [a-z][0-5][A-Zb-u4-9]
 * using negation       [^N][^a-z]
 * 
 */