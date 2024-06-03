package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class temp {

	public static void main(String[] args) {

		String urlString = "https://ning06.tistory.com/56";

		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			conn.setRequestMethod("GET");

			int responsecode = conn.getResponseCode();
			System.out.println("http responscode:" + responsecode);

			BufferedReader brIn = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String inputLine;
			StringBuffer respoBuffer = new StringBuffer();

			while ((inputLine = brIn.readLine()) != null) {
				respoBuffer.append(inputLine);

			}
			brIn.close();

			String[] strHtmls = respoBuffer.toString().split("\\s");

			for (String word : strHtmls) {
				System.out.println(word);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
