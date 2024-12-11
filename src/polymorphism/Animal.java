package polymorphism;

class Animal {
    public void makeSound(){
        System.out.println("waaaaaaaaaaaaaaaaaaaaaaaaa");
    }
}

class Kecoa extends Animal {
    public void makeSound(){
        System.out.println("..ckck...ckck..");
    }
}

class Badak extends Animal {
    public void makeSound(){
        System.out.println("hmmmmbuuffffffff.......");
    }
}

class Kucing extends Animal {
    public void makeSound(){
        System.out.println("meonngggggg....");
    }
}

class main{
    public static void main(String[] args) {
        Animal gajelas = new Animal();
        Animal kecoaSatu = new Kecoa();
        Animal badakSatu = new Badak();
        Animal kucingSatu = new Kucing();

        gajelas.makeSound();
        kecoaSatu.makeSound();
        badakSatu.makeSound();
        kucingSatu.makeSound();
        
    }
}