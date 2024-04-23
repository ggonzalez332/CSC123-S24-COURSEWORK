import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Server1 {

	public static void main(String[] args) throws IOException {
		// listen on port 1200
		ServerSocket server = new ServerSocket(1203);
		while (true) {

			// accept a connection from a client
			Socket sock = server.accept(); // this will block until a client connects
			
			// get input and output streams
						InputStream in = sock.getInputStream();
						OutputStream out = sock.getOutputStream();
						
						// read data from the client

						String clientRequest = readData(in);
						
						String clientResponse = "You  Said: " + clientRequest;
						
			//proxy code
			//Creacket socket
            Socket proxyClientSock = new Socket(clientRequest.strip(), 80);
            
            //Create streams
            OutputStream proxyClientOut = proxyClientSock.getOutputStream();
            InputStream proxyClientIn = proxyClientSock.getInputStream();
     
			  //Data
            String httpRequest="GET / \n";
            
            //Send Datat
            writeData(proxyClientOut, httpRequest);
            
            
            //Receive Data
            String responseFromWebsite = readData(proxyClientIn);
            System.out.println("Server said: " + responseFromWebsite);

			// send data to the client
			writeData(out, responseFromWebsite);
			sock.close();
		}
	}

	private static void writeData(OutputStream out, String data) throws IOException {
		out.write(data.getBytes());
		out.write('\n');
		out.flush();
	}

	private static void writeDataChatGPTStyle(OutputStream out, String data) throws Exception {
	
		byte[] dataBytes= data.getBytes();
		
		for(byte b: dataBytes) {
			out.write(b);
			Thread.sleep(200);
		}
		out.write('\n');
		out.flush();
	}

	
	// read data from the client

	private static String readData(InputStream in) throws IOException {

		int byteRead;
		StringBuffer output = new StringBuffer();

		while ((byteRead = in.read()) != -1) {
			if (byteRead == '\n') {
				break;
			}
			output.append((char) byteRead);
		}
		return output.toString();

	}

}
