public class carMain {
    public static void main(String[] args) {
        carOne myCarOne = new carOne();

        String fullThrotle = myCarOne.fullThrotle();
        String maxSpeed = myCarOne.maxSpeed(400);

        System.out.println(fullThrotle);
        System.out.println(maxSpeed);
    }
    
}
