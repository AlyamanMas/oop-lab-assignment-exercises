import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter the starting number: ");
        var start = inp.nextInt();
        System.out.println("Please enter the number of party goers: ");
        var number = inp.nextInt();
        int chosenNum = start + (new Random()).nextInt(number) + 1;
        System.out.println("chosenNum = " + chosenNum);
    }
}
