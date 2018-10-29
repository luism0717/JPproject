package sample;


public class Screen implements ScreenSpec {

  String resolution;
  int refreshrate;
  int responsetime;

  // Step 9
  // Create a class called Screen that implements ScreenSpec
  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  //  Add three fields String resolutionint refreshrateint responsetime
  public String getResolution() {
    return resolution;
  }

  public int getRefreshRate() {
    return refreshrate;
  }

  public int getResponseTime() {
    return responsetime;
  }


  //Add a toString method that will return the details of the
  // 3 field in the same format as the Product Class.
  public String toString() {
    return "Resolution : " + resolution + "\n"
        + "Refresh rate : " + refreshrate + "\n"
        + "Response time : " + responsetime + "\n";
  }
}
