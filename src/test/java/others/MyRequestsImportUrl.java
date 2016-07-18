package others;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

public class MyRequestsImportUrl {
    public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://www.oracle.com/");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
       
    }
}