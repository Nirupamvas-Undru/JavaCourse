public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(10); //argument 10 is passed in
        int result = giveMe10();
        System.out.println(result);

        result = addThese(10,20); //arguments 10 and 20 are passed in
        System.out.println(result);

        double squareResult = squareOfNUmber(7.25);
        System.out.println(squareResult);
    }//end main

    //void, parameter method
    public static void printHello(){
        System.out.println("Hello there!");
    }//end printHello

    //void, parametrized
    public static void printNumber(int a){
        System.out.println("The number is " + a);
    }//end printNumber

    //value-returning, parameterless
    public static int giveMe10(){
        return 10;
    }//end giveMe10

    //value-returning, parameterized
    public static int addThese(int num1, int num2){
        return num1+num2;
    }//end addThese

    public static double squareOfNUmber(double square){
        return square*square;
    }
}
