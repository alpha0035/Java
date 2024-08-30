import java.util.*;

public class enhancedLoop {
    public static void main(String[] args) {
        System.out.println("Enter your capacity: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= (int) (Math.random()*10) +1;
        }
        for(int value: arr){
            System.out.print(value+" ");
        }
    }
}
/*enhanced for loop has format:
 * for(type identifier : array)
 *     {    
 *          body ...
 *     }
 */
// here, type is the type of array, identifier is a name of local variable to access array