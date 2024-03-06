public class Car extends Vehicle{

    @Override
    void go() {
        System.out.println("The driver is driving the car");
        System.out.println("Where to drive");
    }

    @Override
    void park() {
        System.out.println("The driver is parking the car");
    }
}
