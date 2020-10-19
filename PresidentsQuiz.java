import java.util.Random;
import java.util.Scanner;

public class PresidentsQuiz {

    public static String[] presidents = {"Washington", "Adams", "Jefferson", "Madison", "Monroe",
    "Adams", "Jackson", "Buren", "Harrison", "Tyler", "Polk", "Taylor", "Fillmore",
    "Pierce", "Buchanan", "Lincoln", "Johnson", "Grant", "Hayes", "Garfield", "Arthur",
    "Cleveland", "Harrison", "Cleveland", "Mckinley", "Roosevelt", "Taft", "Wilson", "Harding", "Coolidge", "Hoover",
    "Roosevelt", "Truman", "Eisenhower", "Kennedy", "Johnson", "Nixon", "Ford", "Carter", "Reagan",
    "Bush", "Clinton", "Bush", "Obama", "Trump"};

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        while(true) {

            int presidentNumber = rand.nextInt((presidents.length));

            System.out.println("What is the last name of the " + (presidentNumber+1) + "th president?");
            String presidentInput = input.nextLine().toLowerCase();

            if(presidentInput.equals(presidents[presidentNumber].toLowerCase())) {
                System.out.println("Good Job! The " + (presidentNumber+1) + "th president is " + presidents[presidentNumber] + "!");
            } else {
                System.out.println("Sorry, but '" + presidentInput + "' was not correct.");
                System.out.println("The correct answer was " + presidents[presidentNumber] + ".");
            }
        }
        
    }
}