package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {

        // 1. Collect the user's input on the home, visitor, home score, and visitor score
        // 2. Split that input into separate pieces
        // 3. Compare the scores
        // 4. Print the winning team

        // Scanner
        Scanner read = new Scanner(System.in);

        // Collect user's input
        // Example: Lakers|Warriors|105|112

        System.out.print("Enter game information (home:visitor|homeScore:visitorScore): ");
        String input = read.nextLine();

        // Splits the input into separate pieces
        String[] tokens = input.split(Pattern.quote("|"));

        // Split the team names using :
        String[] teams = tokens[0].split(Pattern.quote(":"));

        // Split the scores using :
        String[] scores = tokens[1].split(Pattern.quote(":"));

        // Extract the team names
        String home = teams[0];
        String visitor = teams[1];

        // Convert from String to int
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        // Compare the scores and print the winning team
        if (homeScore > visitorScore) {
            System.out.println("The winning team is " + home + "!");
        }
        else if (visitorScore > homeScore) {
            System.out.println("The winning team is" + visitor + "!");
        }
        else if (homeScore == visitorScore) {
            System.out.println("The teams have tied!");
        }

        read.close();

    }
}