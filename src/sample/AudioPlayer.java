package sample;



public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecification;
  ItemType mediaType;

  AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.AUDIO;

  }

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

  public String toString() {
    return super.toString() + "\n" +
        "Audio Spec : " + audioSpecification + "\n"
        + "Type : " + mediaType;
  }
}
