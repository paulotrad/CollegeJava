import java.io.IOException;
import java.util.Scanner;

/**Paul Otradovec
 *CMIS 141/7384
 *November 15, 2022
 *Discussion 4
 *
 * THis program adds makes an adjustment to the array and updates the past adjustments
 * mimicking an animation bounces off both ends of the array
  */



public class Asg4 {


    public static void main(String[] args){
        //run triangle iterations
        triangle();
        //run rectangle iterations (I)
        rectangle();

    }

    private static void rectangle() {
        System.out.println("\n\n\n\nPaul Otradovec\n" +
                "CMIS 141/7384\n" +
                "November 20, 2022\n" +
                "Assignment 4\n");
        //setting input variable
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the value of n: ");
        final int getInput = input.nextInt();
        //for loop iterating over amount of iterations requested
        int decrease=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            //nested for loop printing out more numbers per line

            for (int e = 0; e < 9; e++) {

                if (i>3 && e>3 && e<5 && i<5) {
                    System.out.print(getInput-4 + " ");

                }
                else if (i>2 && e>2 && e<6 && i<6) {
                    System.out.print(getInput-3 + " ");

                }
                else if (i>1 && e>1 && e<7 && i<7) {
                    System.out.print(getInput-2 + " ");

                } else if (i>0 && e>0 && e<8 && i<8){
                    System.out.print(getInput-1 + " ");
                }
                else {
                    System.out.print(getInput + " ");
                }
            }
        }
    }


    private static void triangle() {
        System.out.println("Paul Otradovec\n" +
                "CMIS 141/7384\n" +
                "November 20, 2022\n" +
                "Assignment 4\n");
        //setting input variable
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter iteration amount");
        int getInput = input.nextInt();
        //for loop iterating over amount of iterations requested
        for (int i = 0; i < getInput + 1; i++) {
            System.out.println("");
            //nested for loop printing out more numbers per line
            for (int e = 1; e < i + 1; e++) {
                System.out.print(e + " ");
            }
        }

    }
}