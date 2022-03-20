public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream choco = new IceCream("Choclate",3, 2 );
        choco.addTopping("nuts");
        choco.addTopping("cherries");


        System.out.println(choco.getName());
        System.out.println("Cost: $"+ choco.getCost());
        System.out.println("Topped with:");
        choco.printToppings();

        System.out.println();

        IceCream strawberry = new IceCream("Strawberry",2,3);
        strawberry.addTopping("sprinkles");
        System.out.println(strawberry.getName());
        System.out.println("Cost: $"+ strawberry.getCost());
        strawberry.printToppings();

    }
}
