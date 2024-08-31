package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class creating {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<Integer>(); // create new empty linked list
        // Create from other collection
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            arr.add((int)(Math.random()*9+1));
        }
        LinkedList list2= new LinkedList<>(arr);
        System.out.println(list2);
    }
}
