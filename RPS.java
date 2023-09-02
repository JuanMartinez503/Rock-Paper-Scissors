package rps;

import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
              int yourScore = 0;
            int compScore = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Rock Paper and Scissors!\n");

        while (true) {
            System.out.println("What would you choose? \nRock\nPaper\nScissors\nExit");
            // puts the playerChoice and saves it to a variable
            String playerChoice = scan.nextLine().toLowerCase();
            if (playerChoice.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the game. Thanks for playing!");
                break; // Exit the loop
            }
            // stores the users input as a variable
            double numberIndex = (int) (Math.random() * 3);
      

            String[] choicesArray = { "rock", "paper", "scissors" };
            String computerChoice = choicesArray[(int) numberIndex];

            System.out.println("\nPlayer chose: " + playerChoice);
            System.out.println("Computer chose: " + computerChoice + "\n");
            int[] scores = choosingPath(playerChoice, computerChoice, yourScore, compScore);

            yourScore = scores[0];
            compScore = scores[1];
            System.out.println("Computer Score: " + compScore + " Your Score: " + yourScore);

        }
        scan.close();
    }
    /*
     * Function name: choosingPath- chooses a path based on the answer of the user,
     * it designed mostly to account for the user not choosing a correct path
     * 
     * @params choice (String), computerChoice(String), yourScore (int),compScore(int)
     * 
     */

    public static int[] choosingPath(String choice, String computerChoice, int yourScore, int compScore) {
        switch (choice) {
            case "rock":
                return choosingWinner("rock", computerChoice, yourScore, compScore);
            case "paper":
                return choosingWinner("paper", computerChoice, yourScore, compScore);
            case "scissors":
                return choosingWinner("scissors", computerChoice, yourScore, compScore);
            default:
                System.out.println("Choice is not a valid answer");
                return new int[] { yourScore, compScore };
                
        }
    }
    /*
     * Function name: choosingWinner- chooses the winner based on the answer of the
     * player and the randomly selected answer of the computer
     * 
     * @params playerChoice (String) , computerChoice (String), yourScore (int),compScore(int)
     * 
     */

    public static int[] choosingWinner(String playerChoice, String computerChoice, int yourScore, int compScore) {
        System.out.println("\n");
        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock"))) {
            System.out.println("You win!");
            yourScore++;
        } else {
            System.out.println("Computer wins!");
            compScore++;
        }
        System.out.println("\n");
        return new int[] { yourScore, compScore };

    }
}
