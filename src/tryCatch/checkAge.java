package tryCatch;

public class checkAge {
    static String checkUmur(int age){
        if(age<18){
            throw new ArithmeticException("Maaf anda belum cukup umur hanya untuk 18+");
        }else{
            return "Silahkan kakak lewat sini";
        }
    }

    public static void main(String[] args) {
        System.out.println(checkUmur(16));
    }
}
