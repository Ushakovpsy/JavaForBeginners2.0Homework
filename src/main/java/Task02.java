
import java.util.Scanner;

/**
 * * Задание №2
 * Начинаем писать калькулятор:
 * 1.Реализовать сложение дробных чисел, которые пользователь вводит в консоль. Использовать комментарии и JavaDoc
 * при описании метода. Использовать форматирование при выводе результата в консоль. Полученный результат округлять
 * до 4-х знаков после запятой.
 * 2. Запушить проект в свой репозиторий на GitHub
 * 3. Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
 *
 * @author Oleg Ushakov
 */

public class Task02 {

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner scanner1 = new Scanner(System.in);

        // для работы с дробными числами использеум тип данных - double

        double value1 = scanner1.nextDouble();
        System.out.println("Введите второе число");
        double value2 = scanner1.nextDouble();
        System.out.println("Введите требуемую операцию:");
        System.out.println("\"+\" - сложение,  \"-\" - вычитание");
        System.out.println("\"*\" - умножение, \"/\" - деление");

        Scanner scanner2 = new Scanner(System.in);
        String action = scanner2.nextLine();

        if (action.equals("+")) {
            double result = value1 + value2;
            System.out.printf("Результат сложения = " + "%.4f", result);
        } else if (action.equals("-")) {
            double result = value1 - value2;
            System.out.printf("Результат вычитания = " + "%.4f", result);
        } else if (action.equals("*")) {
            double result = value1 * value2;
            System.out.printf("Результат умножения чисел = " + "%.4f", result);
        } else if (action.equals("/")) {
            double result = value1 / value2;
            System.out.printf("Результат деления чисел = " + "%.4f", result);
        }
    }
}
