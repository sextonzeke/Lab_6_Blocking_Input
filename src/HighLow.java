import java.util.Random;
import java.util.Scanner;

public class HighLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int targetNum = 0;
        int guessNum = 0;

        targetNum = rand.nextInt(10) + 1; // random number between 1 and 10

        boolean done = false;
        String trash = "";

        do{
            System.out.println("Guess a number between 1 and 10: ");
            if(in.hasNextInt())
            {
                guessNum = in.nextInt();
                in.nextLine(); // clear the buffer
                if(guessNum < 1 || guessNum > 10)
                {
                    System.out.println("Number must be between 1 and 10. Please try again.");
                }
                else if(guessNum < targetNum)
                {
                    System.out.println("Too low! Target number is " + targetNum);
                    done = true;
                }
                else if(guessNum > targetNum)
                {
                    System.out.println("Too high! Target number is " + targetNum);
                    done = true;
                }
                else
                {
                    System.out.println("Congratulations! You guessed the number " + targetNum + "!");
                    done = true;
                }
            }
            else // Not a number
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " Please enter a valid number.");
            }
        }while(!done);


    }
}
