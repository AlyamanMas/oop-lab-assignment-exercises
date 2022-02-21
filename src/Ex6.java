import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter the first angle alpha: ");
        double a = inp.nextDouble();
        System.out.println("Please enter the second angle beta: ");
        double b = inp.nextDouble();
        System.out.println("Please enter the distance between A and B: ");
        double d = inp.nextDouble();

        double h =
                (d * Math.sin(a) * Math.sin(b)) /
                Math.sqrt(
                        Math.sin(a + b) * Math.sin(a - b)
                );

        System.out.println("The height difference between A and B is: " + h);
    }
}
