public class Screen implements ScreenSpec {

    String resolution;
    int refreshRate;
    int responseTime;


    public Screen() {
        resolution = "Generic";
        refreshRate = 0;
        responseTime = 0;
    }

    public Screen(String resolution, int refresh, int response) {
        this.resolution = resolution;
        this.refreshRate = refresh;
        this.responseTime = response;
    }


    @Override
    public String getResolution() {
        return null;
    }

    @Override
    public int getRefreshRate() {
        return 0;
    }

    @Override
    public int getResponseTime() {
        return 0;
    }

    @Override
    public String toString() {
        return "Resolution : " + resolution + "\n" +
                "Refresh Rate : " + refreshRate + "\n" +
                "Response Time : " + responseTime + "\n";
    }

}
