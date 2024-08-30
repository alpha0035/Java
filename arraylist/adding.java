package arraylist;

import java.util.ArrayList;

public class adding {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(i); // add new elment at end
        }
        arr.add(2, 15); // add new elment at specified index
        System.out.println(arr);

        ArrayList<Integer> arr2= new ArrayList<Integer>();
        // add all elment from specified collection
        arr2.addAll(arr);
        System.out.println(arr2);
        
        //add all elment of the specified collection to specified index of this array list
        arr2.addAll(3, arr);
        System.out.println(arr2);
        
        arr2.clear(); // delete all elments
    }
}
