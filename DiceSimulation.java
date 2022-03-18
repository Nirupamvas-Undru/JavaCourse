import java.util.Random;
public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber;
        for(int i=0;i<10;i++){
            randomNumber = random.nextInt(6)+1;
            System.out.println("Dice roll for "+ (i+1) + " is " +randomNumber);
        }
    }
}
