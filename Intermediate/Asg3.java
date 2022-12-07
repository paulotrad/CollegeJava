import java.util.Scanner;

/**Paul Otradovec
 *CMIS 141/7384
 *November 8, 2022
 *Assignment 3
  */



public class Asg3 {



    public static void main(String[] args) {
        System.out.println("Paul Otradovec\n" +
                "CMIS 141/7384\n" +
                "November 14, 2022\n" +
                "Assignment 3\n");
        //setting input variable
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Do you want to enter a gamer's data? Yes/No => ");
            String getInput = input.next();
            //make a switch to eiher end program or rerun loop
            switch(getInput.toLowerCase()){
                case "yes":
                    break;
                case "no":
                    System.exit(0);// terminate current java runtime
                    System.out.println("Thank you for using this calculator");
                    break;
            }

            System.out.print("Enter gamer's name => ");
            String gamerName = input.next();
            System.out.print("Enter gamer's Level XP scores separated by space: L1 L2 L3 ES => ");
            //looking for next inputs and assigning variables
            int level1 = input.nextInt();

            int level2 = input.nextInt();

            int level3 = input.nextInt();

            int engageScore = input.nextInt();
            System.out.println("Student Name: "+gamerName) ;
            System.out.println("Level 1="+level1);
            System.out.println("Level 2="+level2);
            System.out.println("Level 3="+level3);
            System.out.println("Engagement="+engageScore);
            //packed arithmetic calculation into print out
            System.out.println("Total XP + Bonus="+(level1+(level1*0.20)+level2+(level2*0.30)+level3+(level3*0.50)+engageScore+(engageScore*0.60)));


        }


    }
}