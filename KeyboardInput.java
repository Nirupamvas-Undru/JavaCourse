import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;
        int age;
        double realNumber;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What's your age?");
        age = keyboard.nextInt();
        //Important statement
        keyboard.nextLine(); //consume the newline

        System.out.println("Enter real number?");
        realNumber = keyboard.nextDouble();
        realNumber *= 2;

        keyboard.nextLine();

        System.out.println("What's your city?");
        city = keyboard.nextLine();

        System.out.println("Hello, " + name);
        System.out.println("Age is, " + age);
        System.out.println("City is, " + city);
        System.out.println("RealNumber is, " + realNumber);
    }//end main
}
