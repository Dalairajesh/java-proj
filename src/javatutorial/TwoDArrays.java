package javatutorial;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //input
        for(int i=0; i<rows; i++) {
            //columns
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
//        // output
//        for(int i=0; i<rows; i++){
//            for(int j=0; j<cols; j++) {
//                System.out.print(numbers[i][j] + " ");
//            }
//            System.out.println();
//        }


        // Question: Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs

        for(int i =0; i< rows; i++) {
            for(int j =0; j< cols; j++) {
                if(numbers[i][j] == x) {
                    System.out.println("x found at locations ("+ i +", "+ j + ")");
                }
            }
        }
    }
}
