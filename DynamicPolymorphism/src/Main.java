import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal;
        System.out.println("Which Pet do you want");
        System.out.println("(1=cat) or (2=Cow");

        int choice = sc.nextInt();

        if (choice==1){
            animal = new Cat();
            animal.speak();
        }
        else if (choice==2){
            animal = new Cow();
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("The choice was invalid");
            animal.speak();
        }
    }
}