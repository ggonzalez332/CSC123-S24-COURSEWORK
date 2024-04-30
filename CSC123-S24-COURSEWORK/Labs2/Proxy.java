import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Proxy {

	public static void main(String[] args) throws IOException {
		// listen on port 1200
		ServerSocket server = new ServerSocket(1201);
		while(true) {
			new Worker(server.accept()).start();
		}
		

}
}