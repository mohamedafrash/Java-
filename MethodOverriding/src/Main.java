public class Main {
    public static void main(String[] args) {

        // method overriding = 	Declaring a method in subclass,
        //						which is already present in parent class.
        //						done so that a child class can give its own implementation

        Pet pet = new Pet();
        pet.speak();
        Cat cat = new Cat();
        cat.speak();
    }
}