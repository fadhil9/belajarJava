package tryCatch;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputNomor = new Scanner(System.in);
        int inputanUser;
        
        String[] arrayStrings = {"kodok","semut","jerapah","kudanil"};

        System.out.println("======================= daftar binatang ========================");
        for(int i = 0; i<arrayStrings.length; i++){
            System.out.println(i+1+"."+arrayStrings[i]);
        }
        System.out.println("===============================================");
        System.out.println("");
        System.out.printf("Silahkan pilih nomor berapa :");
        inputanUser = inputNomor.nextInt();

        try {
            System.out.println(arrayStrings[inputanUser-1]);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Maaf nomor yang anda masukan tidak ada didaftar ");
        }
    }
}
