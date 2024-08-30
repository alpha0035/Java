import java.util.Scanner;

/**
 * createArray
 */
public class createArray {

    public static void main(String[] args) {
        int arr[]= new int[5];
        // same effect
        int[] arr2;
        arr2= new int[5];
        System.out.println("Enter your array capacity:");
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        String[] str= new String[n];
        String str2[]= {"Alpha", "Beta", "Gamma"};
        for (int i = 0; i < 5; i++) {
            arr[i]= (int) Math.random()*5+1;
            arr2[i]= (int) Math.random()*5+1;
        }
        scn.close();
    }
}