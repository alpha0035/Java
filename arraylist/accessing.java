package arraylist;

import java.util.ArrayList;

public class accessing {
    public static void main(String[] args) {
        ArrayList<String> str= new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            str.add("Hello"+i*i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(str.get(i)+" ");
        }
        System.out.println("");
        for(String tmp: str){System.out.print(tmp+" ");}
    }
}
