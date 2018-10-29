package sample;

// Step 6
// Create a driver class for AudioPlayer that will test to see whether we can
// instantiate occurrences of it, use the media controls
// and print out their details to the console.
public class AudioPlayerDriver {

  public static void testAudioPlayer() {
    AudioPlayer audioPlayer1 = new AudioPlayer("iPod Mini", "MP3");
    audioPlayer1.play();
    audioPlayer1.stop();
    audioPlayer1.next();
    audioPlayer1.previous();
    System.out.println(audioPlayer1.toString());

    AudioPlayer audioPlayer2 = new AudioPlayer("Walkman", "WAV ");
    System.out.println(audioPlayer2.toString());

  }

}
