package rps;

import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Rock Paper and Scissors!\n");
        System.out.println("What would you choose? \nRock\nPaper\nScissors");
        String PlayerChoice = scan.nextLine().toLowerCase();
        double numberIndex = (int)(Math.random()*3);
        
        String[] choicesArray = {"rock","paper","scissors"};
        String computerChoice = choicesArray[(int) numberIndex];
        System.out.println(PlayerChoice+computerChoice);
        scan.close();
    }

    public static void choosingPath(String choice){
        switch (choice){
            case "rock": 

            break;
            case "paper":

            break;
            case "scissors":

            break;
            default:
            System.out.println("Choice is not a valid answer");
            break;

        }
    }
}