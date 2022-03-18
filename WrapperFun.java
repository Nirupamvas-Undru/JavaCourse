import java.util.ArrayList;
public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();

        myAL.add(10);
        myAL.add(2);
        myAL.add(0);
        myAL.add(12);
        myAL.add(9);

        for(int i=0;i<myAL.size();i++){
            System.out.println(myAL.get(i));
        }

        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue += 10;
        System.out.println(numericValue);


        String someFloat = "3.14159";
        float floatValue = Float.parseFloat(someFloat);
        System.out.println(floatValue);
    }
}
