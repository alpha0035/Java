package regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *  .   any character
 *  \d  any digit 0-9
 *  \D  any nondigit
 *  \s  any white-space character (space, tab, newline, return or backspace)
 *  \S  any non white-space character
 *  \w  any word character (A-Z a-z 0-9 or underscore)
 *  \W  any non word character
 */
public class predefinedCharacter {
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
