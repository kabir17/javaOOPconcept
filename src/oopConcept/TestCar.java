package oopConcept;

public class TestCar {
    public static void main(String[] args) {

        Car carObj = new Toyota(); //Car interface class implemented by Toyota class.
        carObj.shape();            //Only accessible interface method not toyota class method yet.
        carObj.start();
        carObj.stop();
        Car.wheel();    //static method no need create an object for calling,directly calling by class name.

        Toyota corolla = new Toyota();    //No implementation,Its a concrete class/simple class,
        corolla.drive();                  //So it has to create an object itself for access properties.Also
        corolla.shape();                  //can access Interface and Abstract class method.
        corolla.start();
        corolla.stop();
        corolla.hybridEngine();
        corolla.oilEngine();

        MotorCar mObj = new Toyota();     //MotorCar abstract class implement by Concrete class/simple class.
        mObj.engine();           //Only accessible abstract class method not concrete/simple class method yet.
        mObj.hybridEngine();     //abstract method of abstract class.


        Car bmwObj = new BMW();   //Car interface class implemented by BMW class.
        bmwObj.shape();           //Only accessible interface method not BMW class method yet.
        bmwObj.start();
        bmwObj.stop();
        Car.wheel();    //static method no need create an object for calling,directly calling by class name.

        Car honda = new Honda();    //
        honda.shape();
        honda.start();
        honda.stop();

        Vehicle vObj = new Toyota();   //Vehicle is interface, implemented by concrete class Toyota.
        vObj.oilEngine();             //only accessible interface method, not concrete class method.



    }
}
