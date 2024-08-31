package linkedlist;

import java.util.LinkedList;

public class adding {
    public static void main(String[] args) {
        LinkedList list= new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*i+1)); //add elment at the end 
        }
        System.out.println(list);

        list.add(2, 9); // add elment at specified index
        System.out.println(list);

        list.addFirst(0);  // add elment at first of linked list
        System.out.println(list);
    }
}
