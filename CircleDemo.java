public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0);
        System.out.println("R = " +circle1.getRadius());
        System.out.println("C = " +circle1.circumference());
        System.out.println("A = " +circle1.area());

        System.out.println();

        Circle circle2 = new Circle(5.0);
        System.out.println("R = " +circle2.getRadius());
        System.out.println("C = " +circle2.circumference());
        System.out.println("A = " +circle2.area());

        System.out.println();

        Circle circle3 = new Circle(12.75);
        System.out.println("R = " +circle3.circumference());
        System.out.println("C = " +circle3.circumference());
        System.out.println("A = " +circle3.area());
    }
}
