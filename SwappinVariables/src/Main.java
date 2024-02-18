public class Main {
    public static void main(String[] args) {
        String x = "water";
        String y = "Juice";
        String temp;

        temp = x;
        x=y;
        y=temp;
        System.out.println(x);
        System.out.println(y);

    }
}