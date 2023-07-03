import java.util.Scanner;

public class z1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n:");
        int n = scanner.nextInt();
        System.out.println(n + "-ое треугольное число равно " + triangularNumber(n));
        System.out.println("Факториал числа " + n + " равен " + factorial(n));
    }

    public static int triangularNumber(int n) {
        return n * (n + 1) / 2;
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
