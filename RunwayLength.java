import java.util.Scanner;
public class PoundsToKilograms {
public static void main (String[]args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter velocity in m/s: ");
double v  = input.nextDouble();
System.out.print("Enter acceleration in m/s2: ");
double a  = input.nextDouble();

double length = (v * v) / (2 * a);

System.out.println("The minimum runway length for this airplane is " + length);

}

}

