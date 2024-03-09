public class Main {
    public static void main(String[] args) {

        Rabbit rb = new Rabbit();
        rb.flee();
        Hawk hk = new Hawk();
        hk.hunt();
        Fish fh = new Fish();
        fh.flee();
        fh.hunt();
    }
}