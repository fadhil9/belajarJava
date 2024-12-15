package ArrayList;
import java.util.ArrayList;

public class Loop {
    public static void main(String[] args) {
        ArrayList<String> myAnimal = new ArrayList<String>();

        myAnimal.add("kuda");
        myAnimal.add("kucing");
        myAnimal.add("komodo");
        myAnimal.add("t-rex");


        for(int i = 0; i<myAnimal.size();i++){
            System.out.println(myAnimal.get(i));
        }
    }
    
}
