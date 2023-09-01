package rps;

import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Rock Paper and Scissors!\n");
        System.out.println("What would you choose? \nRock\nPaper\nScissors");
        //puts the playerChoice and saves it to a variable
        String playerChoice = scan.nextLine().toLowerCase();
        // stores the users input as a variable
        double numberIndex = (int) (Math.random() * 3);

        String[] choicesArray = { "rock", "paper", "scissors" };
        String computerChoice = choicesArray[(int) numberIndex];

        System.out.println("\nPlayer chose " + playerChoice);
        System.out.println("Player chose " + computerChoice + "\n");
        choosingPath(playerChoice, computerChoice);

        scan.close();
    }
    /*
     * Function name: choosingPath- chooses a path based on the answer of the user,
     * it designed mostly to account for the user not choosing a correct path
     * 
     * @params choice (String), computerChoice(String)
     */

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
    /*
     * Function name: choosingWinner- chooses the winner based on the answer of the player and the randomly selected answer of the computer
     * 
     * @params playerChoice (String) , computerChoice (String)
     * 
     */

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