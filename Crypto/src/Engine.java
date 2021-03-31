import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Engine {

    public void run() {
        try {
            ROT13 rot13 = new ROT13();
            FileWriter myWriter = new FileWriter("sonnet18.enc");
            File file = new File("/Users/Greg/Desktop/Projects/soloLabs/Week5/SimpleCrypt/Crypto/src/sonnet18.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                myWriter.write(rot13.encrypt(sc.nextLine()) + "\n");
            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run2() {
        try {
            ROT13 rot13 = new ROT13();
            FileWriter myWriter = new FileWriter("decryptedSonnet18.enc");
            File file = new File("/Users/Greg/Desktop/Projects/soloLabs/Week5/SimpleCrypt/Crypto/sonnet18.enc");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                myWriter.write(rot13.encrypt(sc.nextLine()) + "\n");
            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
