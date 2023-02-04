import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * <h1 style="color: green">Server Class</h1>
 * <p>Run this second</p>
 */
public class Julia {

    public Julia() {
        try (ServerSocket ss = new ServerSocket(1);
             Socket s = ss.accept();
             BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()))) {

            out.write("O Romeo! Why are you Romeo?");
            out.flush();

        } catch (IOException err) {
            err.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Julia();
    }
}
