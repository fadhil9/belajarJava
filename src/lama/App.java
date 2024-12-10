package lama;
public class App {
    static int perkalian(int a,int b){
        return a*b;
        
    }

    static double pertambahan(double a, double b){
        return a+b;
    }

    public static void main(String[] args) throws Exception {
        // murid murid1 = new murid();
        // int nilai = 10;
        // switchTest switch1 = new switchTest(nilai);
        // whileLoop whileLoop1 = new whileLoop(nilai);
        // Loop loop1 = new Loop(nilai);
        // Loop.forLoop(nilai);
        // String[] mobil = {"mini cooper","ferrari","lamborghini"};

        // Loop.carsLoop(mobil);
        // myMethod();
        // myMethod();
        // myMethod("cungur",170);
        // myMethod("ijal",150);
        // myMethod("jaja",165);
        int hasilPerkalian = perkalian(10, 2);
        double hasilPertambahan = pertambahan(5.5, 5.9);

        
        System.out.println(hasilPerkalian);
        System.out.println(hasilPertambahan);


    }
}
