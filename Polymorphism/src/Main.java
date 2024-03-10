public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike bike = new Motorbike();

        Vehicle[] race = {car,bike};

        for (Vehicle x : race){
            x.go();
        }
    }
}