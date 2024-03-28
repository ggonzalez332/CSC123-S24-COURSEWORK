import java.io.InputStream;
public class MyScanner2 {

	InputStream Is;
	
	public MyScanner2(InputStream Is) {
		this.Is = Is;
	}
	
	public InputStream getInputStream() {
		return Is;
	}
}

