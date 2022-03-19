import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstLastName;
        System.out.print("Enter your full name : ");
        firstLastName = keyboard.nextLine();


        int indexIsSpace = firstLastName.indexOf(" ");
        String firstName = firstLastName.substring(0,indexIsSpace);
        String lastName = firstLastName.substring(indexIsSpace+1);

        String firstNameUppercase = firstName.toUpperCase();
        String lastNameLowercase = lastName.toLowerCase();

        System.out.println("Uppercase of Firstname "+ firstNameUppercase);
        System.out.println("Lowercase of Lastname "+ lastNameLowercase);
    }
}
