/** Application class for Dog.java */
public class DogApp{
   public static void main(String[]args){ 
      Dog dog1 = new Dog(); // a call to the default constructor
      dog1.fillFields();
      System.out.println(dog1.getBreed());
   }
}