package sample;

// Step 11
// Create a class called MoviePlayer that extends Product and implements MultimediaControl.
public class MoviePlayer extends Product implements MultimediaControl {

  Screen screen;
  MonitorType monitorType;

  // Add fields to this class called screen and monitor type and assign appropriate types to them.
  MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  // Complete the methods from the MultimediaControl interface in a similar fashion to the audio player.
  public void play() {

    System.out.println("Playing movie");
  }

  public void stop() {
    System.out.println("Stopping movie");
  }

  public void previous() {

    System.out.println("Previous movie");
  }

  public void next() {
    System.out.println("Next movie");
  }

  // Create a toString method that calls the product toString,
  // displays the monitor and the screen details.
  public String toString() {
    return super.toString() + "\n" +
        "Screen : " + screen
        + "Monitor Type : " + monitorType;
  }
}
