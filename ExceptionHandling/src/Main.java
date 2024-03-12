import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {



           System.out.println("Enter a number to divide");
           int a = sc.nextInt();
           System.out.println("Enter a number to divide");
           int b = sc.nextInt();
           int c = a / b;
           System.out.println("Result " + c);
       }
       catch (ArithmeticException d){
           System.out.println("You cannot divide by zero!");
       }
       catch (InputMismatchException d){
           System.out.println("Only numerics is allowed");
       }
       catch (Exception d){
           System.out.println("Something went wrong");
       }
       finally {
//           System.out.println("This will always printed");
            sc.close();
       }
    }
}