
/**
 * Rock Paper Scissors
 *
 * Austin Tan Nguyen
 * October 10, 2017
 */

import java.util.Scanner;
import java.util.Random;

public class rockpaperscissors
{
  public static void main(String[] args)
  {
      //Player chooses either "Rock," "Paper," or "Scissors"
      String playersChoice;
      //Computer chooses either "Rock," "Paper," or "Scissors"
      String computersChoice = "";
      //Computer's choice is RNG
      
       
      
      String response;
      
      Scanner scan = new Scanner(System.in);
      Random generator = new Random();
      int computerInt = generator.nextInt(3) + 1;
      
      System.out.println("Want to play Rock, Paper, Scissors?");
      System.out.println("ENTER: Rock, Paper, or Scissors ");
      System.out.println("Ready?");
      
      if (computerInt == 1)
      {
            computersChoice = "Rock";
      }
      else if (computerInt == 2) 
      {
            computersChoice = "Paper";
      }
      else if (computerInt == 3)
      {
            computersChoice = "Scissors";
      }
      
      //Player now Chooses what to play
      System.out.println(">> ");
      playersChoice = scan.next();
      
      System.out.println("The computer chooses " +computersChoice);
      
      if (playersChoice.equals(computersChoice))
      {
            System.out.println("Tie ");
        }
      else if (playersChoice.equals("Rock"))
      {
          if (computersChoice.equals("Paper"))
                System.out.println("Rock loses to Paper. Player loses... ");
          else if (computersChoice.equals("Scissors"))
                System.out.println("Scissors loses to Rock. Player wins! ");
            }
      else if (playersChoice.equals("Paper"))
      {
          if (computersChoice.equals("Scissors"))
                System.out.println("Scissors loses to Paper. Player loses... ");
          else if (computersChoice.equals("Rock"))
                System.out.println("Rock loses to Paper. Player wins! ");
            }
      else if (playersChoice.equals("Scissors"))
          {
              if (computersChoice.equals("Rock"))
                    System.out.println("Sisscors loses to Rock. Player loses... ");
              else if (computersChoice.equals("Paper"))
                    System.out.println("Paper loses to Scissors. Player wins! ");
                }
            }
}

// Good job.
