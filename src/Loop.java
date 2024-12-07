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
    
}
