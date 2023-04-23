import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Weight (kg): ");
    double weight = in.nextDouble();
    System.out.print("Height (m): ");
    double height = in.nextDouble();
    double BMI = weight / (height * height);
    System.out.print("The BMI is " + BMI);
  }
}
