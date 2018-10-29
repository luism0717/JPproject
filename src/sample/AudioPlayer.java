package sample;

// Step 5
// We require a concrete class that will allow us to capture the details of an audio player
// Create a class called AudioPlayer that is a subclass of Product
// and implements the MultimediaControl interface.
public class AudioPlayer extends Product implements MultimediaControl {

  //class will have 2 fields
  String audioSpecification;
  ItemType mediaType;

  // Create a constructor that will take in 2 parameters
  // The constructor should call its parents constructor and also setup the media type.
  AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.AUDIO;

  }

  // Implement the methods from the MultimediaControl interface
  // by simply writing the action to the console.
  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopping");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  // Create a toString method that will display the superclasses toString method,
  // but also add rows for Audio Spec and Type.
  public String toString() {
    return super.toString() + "\n" +
        "Audio Spec : " + audioSpecification + "\n"
        + "Type : " + mediaType;
  }
}
