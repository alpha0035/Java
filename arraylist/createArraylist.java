package arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * createArraylist
 */
public class createArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arrl= new ArrayList<Integer>(); // the capacity auto set 10 elments
        // array list automatically increases the capacity whenever necessary
        ArrayList signs= new ArrayList(5);  // this statement have no error
        
        ArrayList<Integer> sgn= new ArrayList<Integer>(20);

        ArrayList sgns= new ArrayList(arrl);
    }
    
}