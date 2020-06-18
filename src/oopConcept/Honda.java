package oopConcept;
//Newly created Honda class,then just implement the car interface.
public class Honda implements Car {

    public void shape(){
        System.out.println("Honda class shape method");
    }
    public void start(){
        System.out.println("Honda class start method");
    }
    public void stop(){
        System.out.println("Honda class stop method");
    }
    public void sensor(){
        System.out.println("Honda class own method");
    }
}
