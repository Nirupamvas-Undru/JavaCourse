import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner twiceDataFile;
        try{
            twiceDataFile = new Scanner(new File("nums.txt"));

            PrintWriter pw = new PrintWriter("twice_nums.txt");
            int value;
            while(twiceDataFile.hasNext()){
                value = twiceDataFile.nextInt();
                value *= value;

                pw.println(value);
            }
            twiceDataFile.close();
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }//end try-catch
    }
}
