import java.io.*;
import java.net.*;
public class DMoz {
	public static void main(String[] args) {
		String target = "";
		for (int i = 0; i < args.length; i++) {
			target += args[i] + " ";
		}
		target = target.trim();
		QueryString query = new QueryString();
		query.add("q", target);
		try {
			System.setProperty("http.agent", "Chrome");
			URL u = new URL("http://www.google.com/search?" + query);
			URLConnection con = new URL(u.toString()).openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (MalformedURLException ex) {
			System.err.println(ex);
		} catch (IOException ex) {
			System.err.println(ex.getMessage());}}}
