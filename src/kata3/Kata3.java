package kata3;
public class Kata3 {
    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        histogram.increment("google.com");
        histogram.increment("google.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("hotmail.com");
        new HistogramDisplay(histogram).execute();
    }
}
