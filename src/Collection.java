import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {

    public static void print(ArrayList list) {
        for (int i = 0; i <= list.size(); i++)
            System.out.println(list + "\n");
    }

    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<Product>();

        list.add(new AudioPlayer("AP 1", "aSpec1"));
        list.add(new MoviePlayer("MP 1", new Screen("1080x915", 70, 20), MonitorType.LED));

        list.add(new AudioPlayer("AP 2", "aSpec2"));
        list.add(new MoviePlayer("MP 2", new Screen("400x200 ", 140, 90), MonitorType.LCD));

        Collections.sort(list);

        print(list);
    }

}
