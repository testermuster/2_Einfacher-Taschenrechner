import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Einfacher Taschenrechner");
            System.out.print("Geben Sie die erste Zahl ein: ");
            double num1 = scanner.nextDouble();

            System.out.print("Geben Sie die zweite Zahl ein: ");
            double num2 = scanner.nextDouble();

            System.out.print("Wählen Sie eine Operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double result;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Division durch Null ist nicht möglich!");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Ungültige Operation!");
                    return;
            }

            System.out.printf("Ergebnis: %.2f\n", result);
        } finally {
            scanner.close();
        }
    }
}
