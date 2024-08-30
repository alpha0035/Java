import java.util.Scanner;

public class twoDimensionalArray {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter your capacity of two dimensional array");
        int x= scn.nextInt();
        int y= scn.nextInt();
        int[][] arrs= new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arrs[i][j]= (int)(Math.random()*9)+1;
            }
        }
        for(int[] arr: arrs){
            for(int value: arr){
                System.out.print(value+" ");
            }
            System.out.println("");
        }
    }
}
