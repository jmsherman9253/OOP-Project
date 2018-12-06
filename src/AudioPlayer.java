import java.util.Date;

public class AudioPlayer extends Product implements MultimediaControl {

    String audioSpecification;
    ItemType mediaType;

    public AudioPlayer() {
        audioSpecification = "Generic";
        mediaType = null;
    }

    public AudioPlayer(String name, String audioSpecification) {
        super(name);
        this.audioSpecification = audioSpecification;
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    @Override
    public void previous() {
        System.out.println("Previous");
    }

    @Override
    public void next() {
        System.out.println("Next");
    }

    @Override
    public String toString() {
        return super.toString() + "Audio Specification : " + audioSpecification + "\n" +
                "Media Type : " + mediaType + "\n";
    }

    @Override
    public Date getManufactureDate() {
        return null;
    }

    @Override
    public void setManufacturer(String manufacturer) {

    }
}
