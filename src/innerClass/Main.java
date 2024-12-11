package innerClass;

class OuterClass{
    int x = 10;

    class InnerClass{
        public int myMethod(){
            return 1000;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();

        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myMethod());
    }
}