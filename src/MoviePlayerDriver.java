public class MoviePlayerDriver {

    public static void main(String[] args) {
        MoviePlayer p = new MoviePlayer();
        System.out.println(p);
        p.play();
        p.previous();
        p.next();
        p.stop();
    }

}
