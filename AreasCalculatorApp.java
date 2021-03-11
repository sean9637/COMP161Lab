/** AreasCalculator class for COMP161 Chapter 3
*Lab 3 Mastery Prc 1/2
*/
import java.util.Scanner; 
public class AreasCalculatorApp{
   public static void main(String[] args){
      Scanner metres = new Scanner(System.in);  // Create a Scanner object
      System.out.println("Enter base and height");
      // base and height inputs
      int base = metres.nextInt();  // Read user input
      int height = metres.nextInt();  // Read user input
      System.out.println("Base is: " + base);
      System.out.println("Height is: " + height);  // Output user input
      areaOfTriangle(base, height);
   }
   
   public static void areaOfTriangle(double base, double height){
      System.out.println("The area of a triangle with a base of " + base + " and a height of " + height + " is " + (0.5 * base * height));
   }
}