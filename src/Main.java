import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double a = 0.0;
//        double b = 0.0;
//        double c = 0.0;

        System.out.println("Please enter the length of a: ");
        double a = scanner.nextDouble();
        System.out.println("Please enter the length of b: ");
        double b = scanner.nextDouble();
        System.out.println("Please enter the length of c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("The length of a is: "+ Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2)));
        } else if (b == 0) {
            System.out.println("The length of b is: "+ Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2)));
        } else if (c == 0){
            System.out.println("The length of c is: "+ Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        }
        scanner.close();

    }
}
