import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Abc");
        nameList.add("Def");
        nameList.add("Ghi");
        nameList.add("Kjl");
        nameList.add("Mno");
/*        for(int i=0;i<nameList.size();i++){
            System.out.println(nameList.get(i));
        }*/
        for(String num : nameList){
            System.out.println(num);
        }
    }
}
