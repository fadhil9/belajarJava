public class car {

    public void fullThrotle(){
        System.out.println("The car is fast as it can!");
    }

    public void maxSpeed(int speed){
        System.out.println("the max speed of this car is "+speed+" kilometers!");
    }
    

    public static void main(String[] args) {
        car myCar = new car();

        myCar.fullThrotle();
        myCar.maxSpeed(300);
    }
}
