package userInputs;
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String  username;
        int age;
        double salary;

        System.out.printf("Enter Username : ");
        username = myObj.nextLine();
        System.out.printf("Enter Age : ");
        age = myObj.nextInt();
        System.out.printf("Enter salary : ");
        salary = myObj.nextDouble();

        System.out.println("");
        System.out.println("your name is :"+username);
        System.out.println("your age is :"+age);
        System.out.println("your salary is :"+salary);
    }
}
