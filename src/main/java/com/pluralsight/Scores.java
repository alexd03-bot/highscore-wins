package com.pluralsight;


import java.util.Scanner;
import java.util.regex.Pattern;

public class Scores {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    //format
    System.out.println("Enter the score (Home:Away|1:2) : ");
    String fullScore = scanner.nextLine();

    String[] HvA = fullScore.split("\\|");

    String[] TheTeams = HvA[0].split(":");
    String home = TheTeams[0];
    String away = TheTeams[1];

    String[] FullScore = HvA[1].split(":");
    int homeScore = Integer.parseInt(FullScore[0]);
    int awayScore = Integer.parseInt(FullScore[1]);

    System.out.println(fullScore);

    if (homeScore > awayScore) {
        System.out.println("Winner is " + home);
    } else if (homeScore < awayScore) {
        System.out.println("Winner is " + away);
    } else {
        System.out.println("Tie!");
    }



    }
}
