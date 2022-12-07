import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**Paul Otradovec
 *CMIS 141/7384
 *December 4, 2022
 *Assignemnt 6
 *
 *Program that will allow the user to determine the placement of robotics teams participating in a regional competition based on the aggregate score from the panel of judges.
  */



public class Asg6 {
    static int [] teamPoints;
    static String[] teamNames;
    public static void main(String[] args) throws IOException {
        System.out.println("\n\n\n\nPaul Otradovec\n" +
                "CMIS 141/7384\n" +
                "December 4, 2022\n" +
                "Assignment 6\n");
        //setting input variable


        Scanner input = new Scanner(System.in);
        //creating new object of InputStreamReader then putting that object in BufferedReader
        BufferedReader inputNames = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many teams do you want to enter: ");
        int amountTeams = input.nextInt();
        teamPoints = new int[amountTeams];
        teamNames = new String[amountTeams];
        //loop determining on how many teams are being inputted
        for (int i = 0; i < amountTeams; i++) {
            System.out.println("Team " + i + ":");
            System.out.print("     Enter team's name: ");
            String teamName = inputNames.readLine();
            teamNames[i] = teamName;
            System.out.print("     Enter team's score (400-1000): ");
            int teamPoint = input.nextInt();
            teamPoints[i] = teamPoint;




        }
        //Output all robotics teams with their aggregate scores
        System.out.println();
        for (int i=0;i<teamPoints.length;i++){
            System.out.println(teamNames[i]+"   "+teamPoints[i]);
        }
        //Output the team that has the highest aggregate score and the team that has the lowest aggregate score.
        int teamMax=getMaxValue(teamPoints);
        int teamLow=getMinValue(teamPoints);
        System.out.println("The "+teamNames[teamMax]+" have the highest score => "+teamPoints[teamMax]+
                " and The "+teamNames[teamLow]+ " have the lowest score => "+teamPoints[teamLow]);


    }

    //Code a method that gets integer array and uses for-loop to find the index of the smallest value
    private static int getMinValue(int[] teamPoints) {
        int minNumber = 0;
        int index=0;
        for (int i = 0; i < teamPoints.length; i++) {
            if (i==0){
               minNumber = teamPoints[i];

            }

            if (teamPoints[i]<minNumber) {
                minNumber = teamPoints[i];
                index = i;
            }


        }
        return index;
    }
    //Code a method that gets integer array and uses for-loop to find the index of the largest value
    public static int getMaxValue(int[] teamPoints) {
        int maxNumber=0;
        int index=0;

        for (int i=0;i<teamPoints.length;i++) {
            if(teamPoints[i]>maxNumber)
                maxNumber=teamPoints[i];
                index=i;


        }
        return index;
    }

}