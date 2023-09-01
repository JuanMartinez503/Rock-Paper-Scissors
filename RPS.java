package rps;

import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Rock Paper and Scissors!\n");
        System.out.println("What would you choose? (Please enter the number associated with the choice)\n1. Rock\n2. Paper\n3. Scissors");
        int choice = scan.nextInt();
        System.out.println(choice);
    }
}