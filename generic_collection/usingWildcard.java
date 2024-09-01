package generic_collection;

import java.util.ArrayList;

public class usingWildcard {
    public static void main(String[] args) {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            tmp.add((int)(Math.random()*i+1));
        }
        test(tmp);
        Bar<Number> obj= new Bar<>(1.3, 4);
        System.out.println(obj.getAlp()+" "+obj.getBet());
        obj.test2(tmp);
    }

    private static void test(ArrayList<?> tmp){
        System.out.println(tmp);
    }

}
// ArrayList<? extends Class-name> list 
// this above statement is used to limit 

class Bar<E>{
    private E alp, bet;
    public Bar(E x, E y){
        alp= x;
        bet= y;
    }
    
    public void test2(ArrayList<? extends E> tmp){
        System.out.println(tmp);
    }

    public E getAlp() {
        return alp;
    }

    public E getBet() {
        return bet;
    }
}