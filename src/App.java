public class App {
    public static void main(String[] args) throws Exception {
        int nilaiAngka = 69;
        char nilai = 'B';
        String namaSiswa = "madun";
        String kelas = "7B";
        int kkm = 70;
       
        System.out.println(namaSiswa);
        System.out.println(kelas);
        System.out.println(nilaiAngka);
        System.out.println(nilai);

        // if(nilaiAngka>=kkm){
        //     System.out.println("Selamat  "+namaSiswa+" Anda lulus");
        // }else{
        //     System.out.println("Maaf  "+namaSiswa+" Anda belum lulus, coba lagi ya!");
        // }
        System.out.println(nilaiAngka>kkm ?"lulus":"tidak lulus");
    }
}
