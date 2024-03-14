import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner sc = new Scanner(System.in);

        File file = new File("C:\\Users\\afraz\\Downloads\\001.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        String response = "";

        while (!response.equals("Q")){
            System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Enter your choice: ");

            response = sc.next();
            response = response.toUpperCase();

            switch (response){
                case("P") :
                    clip.start();
                    break;
                case ("S") :
                    clip.stop();
                    break;
                case ("R") :
                    clip.setMicrosecondPosition(0);
                    break;
                case ("Q") :
                    clip.close();
                    break;
                default:
                    System.out.println("Invalid Response");
            }
        }
        System.out.println("Bye Bye");
    }
}
