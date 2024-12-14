package Date;
import java.time.*;

class Main {
    public static void main(String[] args) {
        LocalDate tanggalSekarang = LocalDate.now(); //LocalDate class import dari java.time*
        LocalTime jamSekarang = LocalTime.now();
        LocalDateTime jamDanTanggal = LocalDateTime.now();

        System.out.println(tanggalSekarang);
        System.out.println(jamSekarang);
        System.out.println(jamDanTanggal);


    }    
}
