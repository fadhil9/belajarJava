package HashMap;
import java.util.HashMap;

public class Main { 
    public static void main(String[] args) {
        HashMap<String,String> ibukota = new HashMap<String,String>();

        ibukota.put("inggris", "London");
        ibukota.put("jerman", "Berlin");
        ibukota.put("Indonesia", "Ikn");

        System.out.println(ibukota);
        System.out.println(ibukota.get("Indonesia"));
        ibukota.remove("inggris");
        System.out.println(ibukota);
        System.out.println(ibukota.size());

        for(String i : ibukota.keySet()){
            System.out.println("key :"+i+" value :"+ibukota.get(i));
        }


        ibukota.clear();
        System.out.println(ibukota);


    }
}
