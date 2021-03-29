import java.util.Scanner;
public class Fairground{
   public static void main(String[]arg){
      //Wall of Death = age > 16 && height > 1.6 && footwear
      //Fling and Twirl = age > 18 && 2.0 >= height >= 1.6 && footwear
      //Gaint Drop = age > 12 && 2.1 >= height >= 1.5
      //Log flume = (age > 10 || accompanied)
      int age;
      double height;
      boolean footwear;
      boolean accompanied;
      Scanner scan = new Scanner(System.in);
      System.out.println("How old are you? - e.g. 18");
      age = scan.nextInt();
      System.out.println("Whats your height(m)? - e.g. 1.6");
      height = scan.nextDouble(); 
      System.out.println("Are you wearing shoes? - T/F");
      footwear = scan.nextBoolean();
      System.out.println("Are you accompanied by an adult? - T/F");
      accompanied = scan.nextBoolean();
      fairUse(age,height,footwear,accompanied); 
   }
   public static void fairUse(int age, double height, boolean footwear, boolean accompanied){
      System.out.println("You are " + age + " years old, have a height of " + height + ".\nWearing shoes- " + footwear + ".\nAccompanied- " + accompanied + ".");
      //Wall of Death = age > 16 && height > 1.6 && footwear
      if ((age > 16 && height > 1.6 && footwear) = true){
         System.out.println("You can ride the Wall of Death");   
      }
      //Fling and Twirl = age > 18 && 2.0 >= height >= 1.6 && footwear
      if ((age > 18 && 2.0 >= height >= 1.6 && footwear) = true){
         System.out.println("You can ride the Fling and Twirl");
      }
      //Gaint Drop = age > 12 && 2.1 >= height >= 1.5
      if ((age > 12 && 2.1 >= height >= 1.5) = true){
         System.out.println("You can ride the Gaint Drop");
      }
      //Log flume = (age > 10 || accompanied)
      if ((age > 10 || accompanied) = true){
         System.out.println("You can ride the Log flume");
      }
      else ()
         System.out.println("You can not ride any rides.");  
   }
}