package working_with_variables_datatypes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputWithBufferReader {
    public static void main(String[] args)
    {
        // creating the instance of class BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        try { // Code that might throw an exception
            System.out.println("Enter your name");
            name = reader.readLine(); // taking string input
            System.out.println("Name= " + name);
        }
        catch (Exception e) {
        }
    }
}
