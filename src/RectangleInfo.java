import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double length = 0.0; // length of the rectangle
        double width = 0.0; // width of the rectangle
        double area = 0.0; // area of the rectangle
        double perimeter = 0.0; // perimeter of the rectangle
        double hypotenuse = 0.0; // length of the diagonal
        boolean done = false;
        String trash = "";

        // Input length


        do {
            System.out.print("Enter the Length: ");
            if (in.hasNextDouble())
            {
                length = in.nextDouble();
                in.nextLine(); // clear the buffer
                if (length > 0)
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

        // Input width

        do {
            System.out.print("Enter the Width: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine(); // clear the buffer
                if (width > 0)
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

        area = length * width;
        perimeter = 2 * (length + width);
        hypotenuse = Math.sqrt((length * length) + (width * width));

        System.out.printf("For a rectangle with length %.2f and width %.2f\n :", length, width);
        System.out.printf("The area is %.2f\n " , area);
        System.out.printf("The perimeter is %.2f\n ", perimeter);
        System.out.printf("The length of the diagonal is %.2f\n ",  hypotenuse);
    }
}
