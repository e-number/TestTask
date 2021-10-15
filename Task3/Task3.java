import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        URL strUrl = new URL("https://services.odata.org/V2/Northwind/Northwind.svc/" +
                "Customers?$select=CustomerID,CompanyName,City,Orders/OrderDate,Orders/" +
                "OrderID&$expand=Orders&$filter=City%20eq%20%27Berlin%27&$format=json&expend=Orders");
        String doc = new Scanner(strUrl.openStream(), "UTF-8").useDelimiter("\\A").next();
        System.out.println(doc);
    }
}