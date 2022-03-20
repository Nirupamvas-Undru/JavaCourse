import java.util.Scanner;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int player1 = 1;
        int player2 = 0;
        int row,col;
        int count = 0;
        int flag = 0;
        int[][] ticBoard = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                ticBoard[i][j] = 0;
            }
        }//end for
        int win = 0;
        while(win!=0){
            if(player1 == 1){
                System.out.println("It is X's turn");
                System.out.println("Please enter the row THEN the column, each " +
                        "from 0, 1, or 2, separated by a space");
                row = keyboard.nextInt();
                col = keyboard.nextInt();


                count++;
                if(count==9){
                    flag = 1;
                }
            }
            else if(player2 == 0){
                System.out.println("It is O's turn");
                System.out.println("Please enter the row THEN the column, each " +
                        "from 0, 1, or 2, separated by a space");
                row = keyboard.nextInt();
                col = keyboard.nextInt();


                count++;
                if(count==9){
                    flag = 1;
                }
            }


            if(flag == 1){
                break;
            }
        }
    }//end main
}
