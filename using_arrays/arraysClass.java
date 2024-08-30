import java.util.Arrays;

public class arraysClass {
    public static void main(String[] args) {
        //filling an array with specified value.
        int[] arr1= new int[10];
        Arrays.fill(arr1, 9);
        for(int val: arr1){
            System.out.print(val+" ");
        }
        System.out.println("");
        //copy an array
        int[] arr2= Arrays.copyOf(arr1, arr1.length);
        for(int val: arr2){
            System.out.print(val+" ");
        }
        System.out.println("");
        // convert an array to String
        System.out.println(Arrays.toString(arr1));
    }   
}
