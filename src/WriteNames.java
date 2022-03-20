import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Abcd");
        names.add("Efgh");
        names.add("Ijkl");
        names.add("Mnop");
        names.add("Qrst");

        try{
            PrintWriter pw = new PrintWriter("names.txt");

            for(String name : names){
                pw.println(name);
            }
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Couldn't find ");
        }
    }
}
