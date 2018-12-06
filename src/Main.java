

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Write one line of code to create an ArrayList of products
        ArrayList product = new ArrayList();
        // Write one line of code to call testCollection and assign the result to the ArrayList
        product = testCollection();
        // Write one line of code to sort the ArrayList
        Collections.sort(product);
        // Call the print method on the ArrayList
        print(product);

        EmployeeInfo employee = new EmployeeInfo();
        System.out.println("employee name: " + employee.getName());
        System.out.println("employee code: " + employee.getCode());
        System.out.println("employee deptID1: " + employee.getDeptId());
        employee.setDeptId();
        System.out.println("employee deptID2: " + employee.getDeptId());

    }

    // Step 15
    // Complete the header for the testCollection method here

    public static ArrayList<Product> testCollection() {

        AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
        AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
        MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
                new Screen(" 720x480", 40, 22), MonitorType.LCD);
        MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
                new Screen("1366x768", 40, 22), MonitorType.LED);

        // Write one line of code here to create the collection
        ArrayList products = new ArrayList();
        products.add(a1);
        products.add(a2);
        products.add(m1);
        products.add(m2);
        return products;
    }

    // Step 16
    // Create print method here
    public static void print(ArrayList list) {
        for (int i = 0; i <= list.size(); i++)
            System.out.println(list + "\n");
    }
}
