import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tanksize = 0.0; // size of the gas tank in gallons
        double mpg = 0.0; // miles per gallon
        double pricepergal = 0.0; // price per gallon of gas
        double miles100Cost = 0.0; // cost to drive 100 miles
        double fulltankDistance = 0.0; // distance the car can travel on a full tank
        boolean done = false;
        String trash = "";

        do {
            System.out.print("Enter the size of the gas tank in gallons: ");
            if (in.hasNextDouble())
            {
                tanksize = in.nextDouble();
                in.nextLine(); // clear the buffer
                if (tanksize > 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Number must be greater than zero. Please try again.");
                }

            }
            else // Not a number
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " Please enter a valid number.");
            }
        } while (!done);

        done = false; // reset for next input

        do {
            System.out.print("Enter the Miles per Gallon: ");
            if (in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine(); // clear the buffer
                if ( mpg > 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Number must be greater than zero. Please try again.");
                }

            }
            else // Not a number
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " Please enter a valid number.");
            }
        } while (!done);

        done = false; // reset for next input


        do {
            System.out.print("Enter the Price per Gallon: ");
            if (in.hasNextDouble())
            {
                pricepergal = in.nextDouble();
                in.nextLine(); // clear the buffer
                if (pricepergal > 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Number must be greater than zero. Please try again.");
                }

            }
            else // Not a number
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " Please enter a valid number.");
            }
        } while (!done);


        miles100Cost = (100 / mpg) * pricepergal;
        fulltankDistance = tanksize * mpg;

        System.out.printf("The cost to drive 100 miles is $%.2f%n", miles100Cost);
        System.out.printf("The distance the car can travel on a full tank is %.1f miles%n", fulltankDistance);




    }
}
