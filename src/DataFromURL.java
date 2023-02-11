import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DataFromURL {
	public static void main(String[] args) {
		try {
			URL u = new URL("https://lolcats.com/");
			InputStream in = u.openStream();
			int c;
			while ((c = in.read()) != -1) System.out.write(c);
			in.close();
		} catch (IOException ex) {
			System.err.println(ex);
		}

	}
}
