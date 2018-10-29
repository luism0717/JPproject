package sample;

public class MoviePlayerDriver {

  // Step 12
  // Create a diver class to test the functionality of the movie player.
  public static void testMoviePlayer() {

    MoviePlayer moviePlayer1 = new MoviePlayer("DBPOWER MK101",
        new Screen("720x480", 40, 22),
        MonitorType.LCD);

    //    moviePlayer1.play();
    //   moviePlayer1.stop();
    //  moviePlayer1.next();
    //   moviePlayer1.previous();

    System.out.println(moviePlayer1.toString());

    MoviePlayer moviePlayer2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22),
        MonitorType.LED);
    System.out.println(moviePlayer2.toString());

  }

}
