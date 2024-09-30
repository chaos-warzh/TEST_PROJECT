package pascal.taie.TEST;

public class SourceSink {

    public static String source() {
        return "secret";
    }

    public static void sink(String s) {
        System.out.println(s);
    }

}
