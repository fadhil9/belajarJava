package inheritance;

class Vehicle{
    protected String Jenis = "Bulldog";
    
    public void gonggong(){
        System.out.println("AUGG AUGG AUGGG");
    }
}

class Binatang extends Vehicle{
    private String namaBinatang = "Anjing";

    public static void main(String[] args) {
        Binatang dogi = new Binatang();

        dogi.gonggong();
        System.out.println(dogi.namaBinatang+" "+dogi.Jenis);
    }
}