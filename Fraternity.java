import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        char gender;

        System.out.println("Enter age ");
        age = keyboard.nextInt();

        System.out.println("Enter Gender");
        gender = keyboard.next().charAt(0);

        if(age>=19 && gender == 'M'){
            System.out.println("Eligible to join Fraternity");
        }
        else{
            System.out.println("Not eligible to join Fraternity");
        }
    }
}
