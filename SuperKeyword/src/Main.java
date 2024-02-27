public class Main {
    public static void main(String[] args) {

        // super = 	keyword refers to the superclass (parent) of an object
        //			very similar to the "this" keyword


        Hero hero = new Hero("Ironman",43,"$$$");
        Hero hero1 = new Hero("Thor",52,"Asgardian");

        System.out.println(hero.toString());
    }
}