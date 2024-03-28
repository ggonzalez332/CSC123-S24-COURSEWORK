import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
public class MyScanner {

	FileInputStream fis;
	
	public MyScanner(File f) throws FileNotFoundException {
		fis = new FileInputStream(f);
	}
	
	public String nextLine() throws IOException {
		int i;
		String j = "";
		char c ;
		while((i=fis.read())!=-1) {
			c = (char)i;
			j+= c;
			if((char)(i) == 10 || (char)(i)== 13) {
				break;
						}
			return j;
		
	}
	return j;
}
}