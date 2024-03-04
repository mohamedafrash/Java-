public class Main {
    public static void main(String[] args) {
        // Encapsulation = 	attributes of a class will be hidden or private,
        //					Can be accessed only through methods (getters & setters)
        //					You should make attributes private if you don't have a reason to make them public/protected

        Car car = new Car("Toyota", "Supra", 2023);

        car.setYear(2024);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}