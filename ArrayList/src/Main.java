import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList = 	a resizable array.
        //				Elements can be added and removed after compilation phase
        //				store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Sandwich");
        food.add("Pasta");

//        food.set(0, "Roti");
//        food.remove(2);
//        food.clear();

        for (int i = 0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}