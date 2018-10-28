package sample;

public class ScreenDriver {

  public static void testScreen() {
    Screen scn = new Screen("600x400", 40, 22);
    System.out.println(scn.toString());
  }

}
