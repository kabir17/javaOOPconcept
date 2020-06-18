package oopConcept;
//Toyota is concrete class.It can Extends abstract class and implements Interface both for access method.
public class Toyota extends MotorCar implements Car,Vehicle {

    public void shape(){
        System.out.println("shape is Interface car method,first make shape");
    }
    public void start(){
        System.out.println("start is Interface Car method,second will start soon");
    }
    public void stop(){
        System.out.println("stop is Interface Car method,third will stop soon");
    }
    public void drive(){
        System.out.println("drive is concrete class method");
    }
    public void hybridEngine(){
        System.out.println("Abstract MotorCar class method,Implement in simple class");
    }
    public void oilEngine(){
        System.out.println("oilEngine is another Interface Vehicle method,implementing in concrete class");
    }
}
