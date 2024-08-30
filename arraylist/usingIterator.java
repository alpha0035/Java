package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class usingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(i*i);
        }
        Iterator it= arr.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
            
        }
    }
}
