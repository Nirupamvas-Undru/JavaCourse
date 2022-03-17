import java.sql.SQLOutput;

public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;


        String myName = "John";
        String yourName = "Johnny";

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        //relational operator
        boolean ageComparison = myAge > yourAge;

        System.out.println("myAge > yourAge?: " + ageComparison);

        ageComparison = yourAge > bobsAge;
        System.out.println("yourAge > bobsAge?; " + ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("yourAge == bobsAge:? " + ageComparison);

        boolean nameComparision = myName.equals(yourName);
        System.out.println("does names match:? "+ nameComparision);

        int currentAge = 21;
        boolean currentAgeComparision = currentAge>=21;
        System.out.println("does currentAge >=21 :? " + currentAgeComparision);
    }// end of main
}
