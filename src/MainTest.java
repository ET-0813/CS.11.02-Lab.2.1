class MainTest {

    @org.junit.jupiter.api.Test
    public static void main() {
    }

    @org.junit.jupiter.api.Test
    public static int add(int i, int ii) {
        return i+ii;
    }

    @org.junit.jupiter.api.Test
    public static int addtwo(int i, int ii, int i1, int i2) {
        return i+ii+i1+i2;
    }

    @org.junit.jupiter.api.Test
    public static String morningGreeting(String input) {

        return "早上好, " + input;
    }

    @org.junit.jupiter.api.Test
    public static String afternoonGreeting(String input) {
        return "下午好, " + input;
    }

    @org.junit.jupiter.api.Test
    public static String triple(String input) {

        return input+input+input;
    }

    @org.junit.jupiter.api.Test
    public static int half(int i) {
        return i/2;
    }

    @org.junit.jupiter.api.Test
    public static int roundToNearestInt(double double1) {
        return (int) Math.round(double1);
    }
}