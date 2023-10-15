import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            System.out.println("Server Started");
            ServerSocket ss = new ServerSocket(3000);
            Socket s = ss.accept();
            System.out.println("Server Connected");
            String str = "Hey This is the message";
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF(str);
            dos.flush();
            dos.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}