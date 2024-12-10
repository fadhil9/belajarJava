package lama;
import java.util.Scanner;

public class carSecond {
        String name;
        int year;
        double emas;
    
        public carSecond(String isiName,int isiYear, double isiEmas){
            name = isiName;
            year = isiYear;
            emas = isiEmas;
        }
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Scanner jawab = new Scanner(System.in);
            
            System.out.println("masukan nama kendaraan: ");
            String nama = input.nextLine();
            System.out.println("masukan tahun kendaraan: ");
            int tahun = input.nextInt();
            System.out.println("masukan emas karat: ");
            double mas = input.nextDouble();
    
            carSecond mobilDua = new carSecond(nama, tahun, mas);
            
            System.out.println(" ");
            System.out.println("coba saya cek, jadi mobil anda "+mobilDua.name+" dan keluaran tahun "+mobilDua.year);
            System.out.println("dan berlapis emas "+mobilDua.emas+" karat"); 
            System.out.println(" ");
            
            System.out.println("apakah betul? ya/tidak");
            String jawaban = jawab.nextLine();
            
            System.out.println(jawaban);
            
            System.out.println(" ");
            if(jawaban.equals("ya")){
                System.out.println("Terima kasih, kami akan lanjutkan proses");
            }else if(jawaban.equals("tidak")){
                System.out.println("Kami akan cek kembali");
            }else{
                System.out.println("tolong menjawab ya/tidak, terima kasih");
            }
    }
}
