import client.Client;
import view.GreatingClient;

public class RunApp {
    public static void main(String[] args) {

        GreatingClient greatingClient = new GreatingClient(new Client("Ruslan", 33, 2000));
        greatingClient.filterOption(greatingClient.greeating());



    }
}
