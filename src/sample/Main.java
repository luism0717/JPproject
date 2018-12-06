package sample;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

  public static void main(String args[]) {

    //Widget w1 = new Widget("Widget 1");
    //System.out.println(w1.toString());
    //Widget w2 = new Widget("Widget 2");
    //System.out.println(w2.toString());

    //for (ItemType it : ItemType.values()) {
    //   System.out.println(it + " " + it.code);
    // }
    // System.out.println();

    // Test Driver classes
    //AudioPlayerDriver.testAudioPlayer();
    //ScreenDriver.testScreen();
    //MoviePlayerDriver.testMoviePlayer();
    //PlayerDriver.testPlayer();

    // Write one line of code to create an ArrayList of products
    ArrayList<Product> products;
    // Write one line of code to call testCollection and assign the result to the ArrayList
    products = testCollection();
    // Write one line of code to sort the ArrayList
    Collections.sort(products);
    // Call the print method on the ArrayList
    print(products);

    // Step 19
    System.out.println("Test Employee Department ID");
    EmployeeInfo employee = new EmployeeInfo();
    System.out.println(employee.toString());

    Main myMain = new Main();
    System.out.println(myMain.reverseString("Abcd12"));
  }

  // Step 20
  public String reverseString(String id) {
    // Paste the code for your reverseString method here.
    StringBuilder s = new StringBuilder(id);
    s = s.reverse();
    return s.toString();
  }


  // Repl.it method for assignment
  public static ArrayList<Product> testCollection() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
        new Screen(" 720x480", 40, 22), MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);

    // Write one line of code here to create the collection
    ArrayList<Product> products = new ArrayList<>();

    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  // Step 16
  // Create print method here
  public static void print(ArrayList<Product> arrayList) {
    for (Product p : arrayList) {
      System.out.println(p.toString());
    }
  }
}

// A test subclass of Product
class Widget extends Product implements Comparable<Product> {

  // Constructor that passes the argument to the superclass Product's constructor
  public Widget(String name) {
    super(name);
  }

}