import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyFile {
	
	String fileName;
	/**
	 * Constructor
	 * @param fileName
	 * @throws IOException
	 */
	public MyFile(String fileName) throws IOException {
		
		this.fileName = fileName;
		if(fileName.equals(null)|| fileName.isEmpty()) {
			throw new IOException("File Name is missing");
		}
		
	}
	
	public String toString() {
		try {
			InputStream in=new FileInputStream(fileName);
			
			int i;

			
			while((i=in.read())!=-1) {
	            System.out.print((char)i);
	        }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return "";
	}
}