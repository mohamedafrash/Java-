import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {


        // inheritance = 	the process where one class acquires,
        //					the attributes and methods of another.

        Car car = new Car();
        Cycle cycle = new Cycle();

        car.go();
        cycle.stop();

        System.out.println(car.doors);
        System.out.println(cycle.seats);
    }
}