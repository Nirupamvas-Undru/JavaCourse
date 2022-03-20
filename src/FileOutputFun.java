import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("output.txt");

            pw.println("Hello There");
            pw.println("My name is Nirupamvas");
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Could'nt write to the file");
        }//end try-catch
    }//end main
}
