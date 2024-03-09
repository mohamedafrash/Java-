public class Fish implements Prey,Hunt{
    @Override
    public void hunt() {
        System.out.println("Fish Hunting");
    }

    @Override
    public void flee() {
        System.out.println("Fish Flee");
    }
}
