import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
  * @author Paul Otradovec
  * Course CMIS 141/Section 2
 * Date: 11/1/2022
 *
  *
 *
 *
 */



public class Asg1 {

    public static void main(String [] arg){
        /*
        Creating new scanner object for taking in basic user information
         */
        Scanner input = new Scanner(System.in);

        /*
        Prompts and variable setting to that input was taken it by user
        type of variable depends on what is required
         */
        System.out.print("Enter customer id: ");
        long customerId=input.nextInt();


        System.out.print("Enter unit price in decimal format (e.g. 3.5): ");
        double unitPrice=input.nextDouble();


        System.out.print("Enter quantity: " );
        int prodQuantity=input.nextInt();

        System.out.print("Enter product description: ");
        /*
        Created a BufferReader object to be able to stream the input data instead of using the clunky Scanner object. This allowed white spaces with no difficulty. Created a catch exemption for the readline in case error arose.
         */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String prodDescription= null;
        try {
            prodDescription = bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        System.out.print("Enter discount in decimal format (e.g. .05): ");
        String percentageDiscount=input.next();
        /*
        Calculations

         */
        double beforeDiscount=prodQuantity*unitPrice;
        double afterDiscount=(prodQuantity*unitPrice)*1-(prodQuantity*unitPrice)*Double.parseDouble(percentageDiscount);



        /*
        Final print out
         */
        System.out.println("Name: Paul Otradovec");
        System.out.println("Course: CMIS 141/Section 2");
        System.out.println("Date: 11/1/2022");
        System.out.println("ORDER DATA: ");
        System.out.println("Customer id: " +customerId);
        System.out.println("Unit Price: " +unitPrice);
        System.out.println("Quantity: "+prodQuantity);
        System.out.println("Product Description: " + prodDescription);
        System.out.println("Discount: " + percentageDiscount);
        System.out.println("Order total BEFORE discount: $"+ beforeDiscount);
        System.out.println("Order total AFTER discount: $"+afterDiscount);
    }
}
