import java.util.InputMismatchException;
import java.util.Scanner;

/**Paul Otradovec
 *CMIS 141/7384
 *November 8, 2022
 *Week Two Assignment
 */



public class Asg2 {



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Paul Otradovec\nCMIS 141/7384\n" +
                        "November 8, 2022\nWeek Two Assignment");
        //intializing variables and char
        int firstParam;
        int secParam=0;
        char operator;
        System.out.print ("Enter two integer numbers between 200 and 1000\n" +
                "separated by a space:");
       //grabbing first variable
        firstParam=input.nextInt();

        try {
            //mainly dont want a zero as a divisor so checking for throw second variable
            secParam = input.nextInt();
        }catch(InputMismatchException e){

            System.out.println(e);
        }
        System.out.print("Enter operation symbol (+, -, *, or /): ");
        operator=input.next().charAt(0);
    //creating switch case in order to decide path
        switch (operator) {
            case '*':
                System.out.println("Evaluation: "+(firstParam*secParam));
                break;
            case '-':
                System.out.println("Evaluation: "+(firstParam-secParam));
                break;
            case '+':
                System.out.println("Evaluation: "+(firstParam-secParam));
                break;
            case '/':
                try{
                    System.out.println("Evaluation: "+firstParam/secParam);
                }catch(ArithmeticException e){
                    System.out.println(e);
                }


                break;


        }

    }
}