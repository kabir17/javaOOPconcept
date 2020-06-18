package oopConcept;
//Declare Interface as Car with default abstract methods and non-abstract static method.
public interface Car {        //Multiple cLass can have an Interface.

     public void shape();
     public void start();
     public void stop();

     public static void wheel(){
         System.out.println("static method allow as Interface Car");
     }
}
