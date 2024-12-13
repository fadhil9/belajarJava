package abstraction;

abstract class abstraction {
    //abstract itu kek paret class dan dia ga bisa dijadiin objek karna tujuanya buat bikin subclass nah subclass nya
    //yang dipake
    public abstract void animalSound();

    public void makeSound(){
        System.out.println("iyyaaaawwww..........");
    }
    
}

class Kodok extends abstraction{
    public void animalSound(){
        System.out.println("krok krok,, krok krok,,");
    }
}

class Kucing extends abstraction{
    public void animalSound(){
        System.out.println("meong meongg");
    }
}

class main{
    public static void main(String[] args) {
        Kodok myKodok = new Kodok();
        Kucing myKucing = new Kucing();

        myKodok.animalSound();
        myKodok.makeSound();

        myKucing.animalSound();
        myKucing.makeSound();
    }
}
