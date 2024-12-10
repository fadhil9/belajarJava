package lama;
import java.util.Scanner;

public class constructor { //class
    int xx;   //atribut

    public constructor(int y){ //constructor
         xx = y;
    }
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in); 
        System.out.println("masukan inpunt :");
        int varInput = masuk.nextInt();


        constructor kesatu = new constructor(varInput);

        System.out.println("nilainya adalah :"+kesatu.xx);
    }
}
