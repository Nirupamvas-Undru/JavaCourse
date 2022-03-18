import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;
        int sumoOfNumbers = 0;
        System.out.println("Enter a non negative integer");
        System.out.println("or negative to exit");
        input = keyboard.nextInt();
        while(input >=0 ){
            sumoOfNumbers += input;
            System.out.println("Enter a non negative integer");
            System.out.println("or negative to exit");
            input = keyboard.nextInt();
        }//end while
        System.out.println("Sum of the numbers entered are :"+sumoOfNumbers);
    }
}
