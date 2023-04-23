import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter base");
    int base = sc.nextInt();
    int x, y;
    for(x = 0; x < base; x++)
    {
      for(y = 0; y <= x; y++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
