package iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //make collection
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> nomor = new ArrayList<Integer>();

        cars.add("hino");
        cars.add("bmw");

        nomor.add(10);
        nomor.add(100);
        nomor.add(128);
        nomor.add(4);

        //get the iterator
        Iterator<String> it = cars.iterator();
        Iterator<Integer> nom = nomor.iterator();

        // System.out.println("1."+it.next());
        
        while (it.hasNext()) {
            System.out.println(it.next());    
        }

        while (nom.hasNext()) {
            Integer i = nom.next();
            if(i<=10){
                nom.remove();
            }            
        }

        System.out.println(nomor);
        System.out.println(cars);
    }
}
