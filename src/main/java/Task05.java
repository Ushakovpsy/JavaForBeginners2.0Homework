import java.io.IOException;
import java.util.Scanner;

/**
 * * Задание №5
 * Реализовать калькулятор в стиле ООП. Архитектуру приложения продумать самостоятельно.
 *
 * @author Oleg Ushakov
 */

public class Task05 {
    public static void main(String[] args) throws IOException {

        double num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Результат:" + result);

    }

    public static double getNumber () {
        System.out.println("Введите число");
        Scanner scaner1 = new Scanner(System.in);
        if (scaner1.hasNextDouble()) {
            return scaner1.nextDouble();
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод");
            return getNumber();
        }
    }


    public static char getOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите номер операции:\n1 - сложение\n2 - вычитание\n3 - умножение\n4 - деление");
        int operationNumber = 0;
        if(sc.hasNextInt()) {
            operationNumber = sc.nextInt();
        }

        else {
            System.out.println("Вы ввели не число! Повторите ввод!");
            return getOperation();
        }

        switch (operationNumber) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Неправильная операция! Повторите ввод!");
                return getOperation();
        }
    }

    public static double add(double num1, double num2) {
        return num1+num2;
    }

    public static double sub(double num1, double num2) {
        return num1-num2;
    }

    public static double mul(double num1, double num2) {
        return num1*num2;
    }

    public static double div(double num1, double num2) {
        if(num2 != 0.0) {
            return num1/num2;
        } else {
            System.out.println("На 0 делить нельзя!");
            return Double.NaN;
        }
    }

    public static double calc(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return sub(num1, num2);
            case '*':
                return mul(num1, num2);
            case '/':
                return div(num1, num2);
            default:
                return Double.NaN;
        }
    }
}
