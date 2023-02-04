import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * <h1 style="color: green">Client Class</h1>
 * <p>Run this first</p>
 */
public class Romeo {

    public Romeo() {
        try (Socket s = new Socket("127.0.0.1", 1);
             BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()))) {

            String message = in.readLine();
            System.out.println(message);

        } catch (IOException err) {
            err.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new Romeo();
    }
}
