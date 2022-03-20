import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;
        int sumOfFileElements = 0;
        try {
            infile = new Scanner(new File("input.txt"));
            int input;
            while(infile.hasNext()){
                input = infile.nextInt();
                sumOfFileElements += input;
            }//end while
            infile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Can't find file!");
            System.out.println(ex.getMessage());
        }//end try-catch
        catch (InputMismatchException ex){
            System.out.println("Error reading input");
        }
        System.out.println("Sum of all file contents are :" + sumOfFileElements);
    }//end main
}
