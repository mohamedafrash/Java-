public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("Thin Crust","Tomato","Mozzarella", "Pepperoni");
        System.out.println("This is your Pizza");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.toppings);


    }
}