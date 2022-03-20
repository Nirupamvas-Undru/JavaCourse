import java.util.ArrayList;

public class Proj6_1_SumOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(100);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("sum is " + sumElements(arrayList));
    }//end main

    public static int sumElements(ArrayList<Integer> arrayList){
        int sumOfArray = 0;
        for(int num : arrayList){
            sumOfArray += num;
        }
        return sumOfArray;
    }
}
