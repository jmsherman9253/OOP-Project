import java.util.Date;

public class MoviePlayer extends Product implements MultimediaControl {

    private Screen screen;
    private MonitorType monitorType;

    public MoviePlayer() {
        super();
        screen = new Screen();
        monitorType = MonitorType.LCD;
    }

    public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
        super(name);
        this.screen = screen;
        this.monitorType = monitorType;
    }

    @Override
    public void play() {
        System.out.println("Playing Movie");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Movie");
    }

    @Override
    public void previous() {
        System.out.println("Previous Movie");
    }

    @Override
    public void next() {
        System.out.println("Next Movie");
    }

    public String toString() {
        System.out.println(super.toString());
        return screen.toString() + "Monitor Type : " + monitorType;
    }


    @Override
    public Date getManufactureDate() {
        return null;
    }

    @Override
    public void setManufacturer(String manufacturer) {

    }
}

