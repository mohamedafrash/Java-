public class Main {

    public static void main(String[] args) {

        // method = a block of code that is executed whenever it is called upon

        int x = 9;
        int y = 6;

        int z = add(x,y);

        System.out.println(z);
    }

    static int add(int x, int y) {

        int z = x + y;
        return z;

    }

}