/**  Lab 5 BoxApp.java */
public class BoxApp{
   public static void main(String[]args){
      Box box1 = new Box(2.5);
      Box box2 = new Box(2,2,3);
      System.out.println("Box 1 has an area of " + box1.getArea() + " units\n" + "Box 2 has a volume of "
      + box2.getVolume() + " units.");
   }
}