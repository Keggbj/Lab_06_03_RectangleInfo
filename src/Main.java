import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math; // the Javaprogammer.com showed me this when I was clueless on how to square numbers instead of multiplying it by itself

public class Main
{
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            String trash = "";
            int sideOne = 0;
            int sideTwo = 0;
            int totalArea = 0;
            int totalPerimeter = 0;
            double diagonal = 0;
            System.out.print("Enter the first side: ");
            if (in.hasNextInt()) {
                sideOne = in.nextInt();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a number!");
            }
            System.out.print("Enter the second side: ");
            if (in.hasNextInt()) {
                sideTwo = in.nextInt();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a number!");
            }
        {
            totalArea = sideOne * sideTwo;
            totalPerimeter = (sideOne * 2) + (sideTwo * 2);
            diagonal = Math.sqrt(sideOne * sideOne + sideTwo * sideTwo);
            {
                System.out.println("The area of the rectangle is " + totalArea + " and the perimeter is " + totalPerimeter);
                System.out.println("The diagonal of the rectangle is: " + diagonal);
            }
        }
    }
}