package lama;
public class murid {

    murid(){
        tampilkan();
        cekKelulusan();
    }
        char nilai = 'B';
        String namaSiswa = "madun";
        String kelas = "7B";
        int kkm = 70;
        int nilaiAngka = 80;

        public void tampilkan(){
            System.out.println(namaSiswa);
            System.out.println(kelas);
            System.out.println(nilaiAngka);
            System.out.println(nilai);

        }
        public void cekKelulusan(){
            // if(nilaiAngka>=kkm){
        //     System.out.println("Selamat  "+namaSiswa+" Anda lulus");
        // }else{
        //     System.out.println("Maaf  "+namaSiswa+" Anda belum lulus, coba lagi ya!");
        // }
        System.out.println(nilaiAngka>kkm ?"lulus":"tidak lulus");
        }
}
