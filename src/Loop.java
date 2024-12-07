public class Loop {
    public Loop(int nilai){
        while (nilai>1) {
            System.out.println("cetak ke : "+nilai);
            nilai--;            
        }
    }

    public static void forLoop(int nilai){
        for(int i = nilai; i>0; i--){
            System.out.println("cetak for loop ke : "+i);
        }
    }

    public static void carsLoop(String[] cars){
        System.out.println("Mobil saya ada banyak, ini nama-nama mobil saya :");
        int count = 1;
        for(String i:cars){
            System.out.println(count+"."+i);
            count++;
        }
    }
    
}
