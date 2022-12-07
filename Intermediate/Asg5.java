import java.util.Scanner;

/**Paul Otradovec
 *CMIS 141/7384
 *November 15, 2022
 *Discussion 4
 *
 * THis program adds makes an adjustment to the array and updates the past adjustments
 * mimicking an animation bounces off both ends of the array
  */



public class Asg5 {


    public static void main(String[] args){
        System.out.println("\n\n\n\nPaul Otradovec\n" +
                "CMIS 141/7384\n" +
                "November 28, 2022\n" +
                "Assignment 5\n");
        //setting input variable

       while (true){
           Scanner input = new Scanner(System.in);
           System.out.println("Enter a option:\n"+"(1) Convert cubic feet to U.S. bushels\n" +
                   "(2) Convert miles to kilometers\n" +
                   "(3) Determine graduation with honors title\n" +
                   "(4) Exit program");
           //swtich statment to determine what functiont o call based on selection
           int getNextInt = input.nextInt();
           switch (getNextInt){
               case 1:
                   FeetToBushel();
                   break;
               case 2:
                   MilesToKilo();
                   break;
               case 3:
                   GraduationHonors();
                   break;
               case 4:
                   System.exit(4);
                   break;

           }
       }

    }

    /**
     * THis function takes in GPA and outputs yours Honors
     */
    private static void GraduationHonors() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Graduation GPA ");

        double getNextDouble = input.nextDouble();
        if (getNextDouble == 3.5 || getNextDouble == 3.6 || getNextDouble == 3.7) {
            System.out.println("Congratulations, you have graduated  Cum Laude \n\n");
        } else if (getNextDouble == 3.8 || getNextDouble == 3.9) {


            System.out.println("Congratulations, you have graduated Magna Cum Laude!!");
        } else if (getNextDouble == 4.0||getNextDouble>4.0) {
            System.out.println("Congratulations, you have graduated Summa Cum Laude!!\n\n");
        }
       else{
            System.out.println("reenter");
        }


    }
    /**
     * THis function takes in Miles and converts to Kilometers
     */
    private static void MilesToKilo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Miles to convert to Kilometers: ");

        int getNextInt = input.nextInt();

        System.out.println(getNextInt+" Miles equals "+((double) getNextInt* 1.609)+" Kilometers\n\n");

    }

    /**
     *  THis function takes in Cubic Feet and converts to Bushels
     *
     */

    private static void FeetToBushel() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter feet to convert to US Bushels :");

        int getNextInt = input.nextInt();

        System.out.println(getNextInt+" feet equals "+((double) getNextInt/1.244 )+" bushels\n\n");
    }


}