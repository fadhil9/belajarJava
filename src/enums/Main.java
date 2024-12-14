package enums;

enum level {
    LOW,
    MEDIUM,
    HIGH
}

public class Main{
    public static void main(String[] args) {
        level myVar = level.MEDIUM;
        System.out.println(myVar);
    }
}
