import java.util.Scanner;

public class z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введите действие (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число:");
        double num2 = scanner.nextDouble();

        switch (operation) {
            case '+':
                System.out.println("Результат: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Результат: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Результат: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Результат: " + (num1 / num2));
                } else {
                    System.out.println("Ошибка: деление на ноль невозможно.");
                }
                break;
            default:
                System.out.println("Ошибка: неверная операция.");
        }
    }
}
