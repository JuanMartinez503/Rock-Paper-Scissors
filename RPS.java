package rps;

import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Rock Paper and Scissors!\n");
        System.out.println("What would you choose? \nRock\nPaper\nScissors");
        String playerChoice = scan.nextLine().toLowerCase();
        double numberIndex = (int) (Math.random() * 3);

        String[] choicesArray = { "rock", "paper", "scissors" };
        String computerChoice = choicesArray[(int) numberIndex];
        System.out.println("Player chose " + playerChoice);
        System.out.println("Player chose " + computerChoice + "\n");
        choosingPath(playerChoice, computerChoice);

        scan.close();
    }

    public static void choosingPath(String choice, String computerChoice) {
        switch (choice) {
            case "rock":
                choosingWinner("rock", computerChoice);
                break;
            case "paper":
                choosingWinner("paper", computerChoice);

                break;
            case "scissors":
                choosingWinner("scissors", computerChoice);

                break;
            default:
                System.out.println("Choice is not a valid answer");
                break;

        }
    }

    public static void choosingWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}