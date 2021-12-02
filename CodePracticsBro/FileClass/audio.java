package FileClass;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class audio {
    public static void main(String[] args) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        Scanner scanner=new Scanner(System.in);

        File file=new File("D:\\song.mp3");
        AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioStream);

        String responce = "";

        while(!responce.equals("Q")){
            System.out.println("Slelect P=play,S=stop,R=repeat,Q=quit");
            System.out.print("Enter your way: ");

            responce=scanner.next();
           responce= responce.toUpperCase();

            switch (responce){
                case ("P"):clip.start();
                break;
                case ("S"):clip.stop();
                break;
                case ("R"):clip.setMicrosecondPosition(0);
                break;
                case ("Q"):clip.close();
                break;
                default:
                    System.out.println("Not a valid");
            }

        }

    }
}
