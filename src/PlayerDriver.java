import com.sun.org.apache.xpath.internal.operations.Mult;

public class PlayerDriver {

    public static void testPlayer() {
        MultimediaControl audioPlayerOne = new AudioPlayer();

        audioPlayerOne.next();
        audioPlayerOne.play();
        audioPlayerOne.previous();
        audioPlayerOne.stop();

        MultimediaControl moviePlayerOne = new MoviePlayer();

        moviePlayerOne.next();
        moviePlayerOne.play();
        moviePlayerOne.previous();
        moviePlayerOne.stop();
    }
}
