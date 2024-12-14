package interfaces;

interface animal {
    public void animalSound();
    public void sleep();
} 

class Semut implements animal{
    public void animalSound(){
        System.out.println(".........");
    }

    public void sleep(){
        System.out.println("Zzzz....");
    }
}

class main{
    public static void main(String[] args) {
        Semut mySemut = new Semut();

        mySemut.animalSound();
        mySemut.sleep();
    }
}
