public class AudioPlayerDriver {

    public static void testAudioPlayer() {

        AudioPlayer audioPlayerOne = new AudioPlayer("iPhone X", "LTE");
        AudioPlayer audioPlayerTwo = new AudioPlayer("iPod Nano", "MP3");

        audioPlayerOne.play();
        audioPlayerTwo.stop();
        audioPlayerOne.next();
        audioPlayerTwo.previous();

        System.out.println(audioPlayerOne);
        System.out.println(audioPlayerTwo);
    }

}
