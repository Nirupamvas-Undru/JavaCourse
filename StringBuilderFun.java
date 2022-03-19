public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("John Baugh");

        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(5,"Phillip ");
        System.out.println(sb);

        sb.replace(22,29,"amazing");
        System.out.println(sb);

        //deleting the middle name
        sb.delete(5,13);
        System.out.println(sb);

        sb.replace(0,5,"DR. ");
        System.out.println(sb);
    }//end main
}
