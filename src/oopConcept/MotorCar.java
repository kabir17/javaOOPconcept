package oopConcept;
//Abstract class can have non-abstract and abstract method both.
public abstract class MotorCar {

    public void engine(){
        System.out.println("MotorCar class non-abstract method,can access in simple class");
    }
    //this abstract method,we cannot implement here,implement will be in concrete/simple class.
    public abstract void hybridEngine();
}
