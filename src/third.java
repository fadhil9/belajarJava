public class third {
    public void cobaMethodPublic(){
        System.out.println("ini adalah method public,harus buat objek untuk manggil");
    }
    
    static void cobaMethodStatic(){
        System.out.println("ini adalah method static, tanpa harus buat objek baru");
    }
    public static void main(String[] args) {
        third metodPublicSatu = new third(); // ini objek baru method public

        metodPublicSatu.cobaMethodPublic(); // memanggil method  public harus buat objek baru dulu
        third.cobaMethodStatic(); //memanggil method static tanpa harus buat objek baru
    }
}
