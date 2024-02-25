import java.util.Random;

public class DiceRoller {

    Random rd;
    int number;

    DiceRoller(){
        rd = new Random();
        roll();
    }

    void roll(){
        number = rd.nextInt(6)+1;
        System.out.println(number);
    }
}
