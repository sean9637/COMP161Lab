import java.util.Scanner;

public class ScooterRideApp_V2{
   public static final double UNLOCK_FEE = 1.5;
   public static final double COST_PER_MINUTE = 0.3;

   public static void main (String[]args){
      double numMin;
      Scanner scan = new Scanner(System.in);
      System.out.println("How long, in minutes, were you on the scooter?");
      numMin = scan.nextDouble();
      calculation(numMin);
   }
   /**Add a method here that calculates and returns the estimated cost of a scooter ride*/
   public static void calculation(double numMin){
      double estimation = COST_PER_MINUTE * numMin + UNLOCK_FEE;
      double input = readDouble("Give me a number to 8dp");
      System.out.println(input);
      System.out.println("We estimate that it will cost: " + estimation + "$");
      System.out.println("Thats what you put -> " + readDouble("Whats half of 5?"));
   }
 

   /** A method that takes a String which will be printed out as a prompt to the user
   and returns a double which has been entered via the keybaord */
   public static double readDouble(String message){
      Scanner scan = new Scanner(System.in);
      System.out.println(message);
      double input = scan.nextDouble();
      return input;
   }

}