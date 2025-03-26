
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name");
        String name = scan.nextLine();

        System.out.println("how old are you");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("What is your favorite food");
        String food = scan.nextLine();

        System.out.println("welcome "+ name);
        System.out.println("your are  "+ age + " years old");
        System.out.println("your like "+ food);

    }
}