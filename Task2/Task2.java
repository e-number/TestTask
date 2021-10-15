import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws MalformedURLException {
        List<String> function = new ArrayList<>();
        URL url = new URL("https://raw.githubusercontent.com/SAP-samples/" +
                "s4hana-ext-deploy-custom-ui/main/webapp/controller/Detail.controller.js");
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                if (inputLine.contains(": function") && inputLine.contains(",")) {
                    function.add(inputLine.replaceAll("\\s+",""));
                }
            for (String functions : function) {
                long count = functions.codePoints().filter(ch -> ch ==',').count() + 1;
                System.out.println(functions.substring(0, functions.indexOf(":")) + " : " + count);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}