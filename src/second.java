public class second {//ini class
    int x = 11; //ini atribut

    String fname;
    String lname;
    int age;
    int height;

    static String mengaum(){
        return "rawrrrrrrrrrrr";
    }
    public static void main(String[] args) {
        second myObject = new second(); //object 1
        second myObject2 = new second(); //object 1
        myObject2.x = 20;  //ngubah value atributs

        second customerSatu = new second();
        customerSatu.fname = "jaka";
        customerSatu.lname = "tarub";
        customerSatu.age = 17;
        customerSatu.height = 170;

        second customerDua = new second();
        customerDua.fname = "siti";
        customerDua.lname = "maesaroh";
        customerDua.age = 30;
        customerDua.height = 160;


        System.out.println(customerSatu.fname +" "+ second.mengaum()); 
        System.out.println(customerDua.fname); 
        
    }
}
