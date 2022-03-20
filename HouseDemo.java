public class HouseDemo {
    public void printHouseData(House myHouse){
        System.out.println("The house is " + myHouse.getColor() +
                " and has " + myHouse.getNumStories() + " stories and " +
                myHouse.getNumWindows() + " windows. ");
    }
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(3,10,"blue");

        myHouse.setNumStories(2);
        myHouse.setNumWindows(6);
        myHouse.setColor("red");

        HouseDemo houseDemo = new HouseDemo();
        houseDemo.printHouseData(yourHouse);
//        yourHouse.setNumWindows(3);
//        yourHouse.setNumStories(10);
//        yourHouse.setColor("blue");

//        System.out.println("My house is " + myHouse.getColor() +
//                " and has " + myHouse.getNumStories() + " stories and " +
//                myHouse.getNumWindows() + " windows. ");
//        System.out.println("Your house is " + yourHouse.getColor() +
//                " and has " + yourHouse.getNumStories() + " stories and " +
//                yourHouse.getNumWindows() + " windows. ");
    }//end main


}//end HouseDemo
