package sample;


// Step 10
// Create a Driver class for Screen that tests the functionality of the screen class
public class ScreenDriver {

  public static void testScreen() {
    Screen scn = new Screen("600x400", 40, 22);
    System.out.println(scn.toString());
  }

}
