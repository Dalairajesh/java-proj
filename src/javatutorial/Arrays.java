package javatutorial;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);

        for(int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }

        // define 2 type array

    int marks1[] = {97, 98, 95};
        // user input
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

         for(int i = 0; i< size; i++) {
             numbers[i] = sc.nextInt();
         }

         int x = sc.nextInt();

         // output
        for(int j =0; j < numbers.length; j++) {
            if(numbers[j] == x)
             System.out.println("x found at index :" +j);
        }


    }
}
