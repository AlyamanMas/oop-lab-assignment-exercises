
public class Ex4 {
    public static void main(String[] args) {
        double s0 = 10.0;
        double v0 = 0.0;
        double a = 2.0;
        double t = 5;

        double s = s0 + (v0 * t) + (0.5 * a * Math.pow(t, 2));
        System.out.println("The position of a body with initial velocity v0 = " + v0 +
                           ", initial position s0 = " + s0 +
                           ", acceleration a = " + a +
                           " and time t = " + t +
                           " equals " + s);
    }
}
