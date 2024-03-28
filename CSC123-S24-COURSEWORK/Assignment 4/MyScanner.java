import java.io.InputStream;
public class MyScanner {

	InputStream Is;
	
	public MyScanner(InputStream Is) {
		this.Is = Is;
	}
	
	public InputStream getInputStream() {
		return Is;
	}
}
