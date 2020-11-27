import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

/**
 * Задание №3
 * 1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания
 * 2. Поиск максимального элемента в массиве. Для начала задать массив слов.Размерность массива произвольна, задается в консоли. После чего в консоли вводятся слова в количестве равном заданной длине массива. В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
 * 3. Программа должна выполнять одно из заданий на выбор. Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
 *
 * @author Oleg Ushakov
 */

public class Task03 {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите \"1\" чтобы запустить выполнение калькулятора");
        System.out.println("Введите \"2\" чтобы осуществить поиск максимального слова в массиве");

        Scanner scaner1 = new Scanner(System.in);
        String action = scaner1.nextLine();
        if (action.equals("1")) {
            double num1 = getNumber();
            double num2 = getNumber();
            char operation = getOperation();
            double result = calc(num1, num2, operation);
            System.out.println("Результат:" + result);
        } else if (action.equals("2")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Определите размер массива");
            // объявляем массив
            int a = Integer.parseInt(reader.readLine());
            String[] array = new String[a];

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите слова одной строкой через пробел");
            String input = sc.nextLine();

            array = input.split(" ");
            String maxLen = array[0];

            for (String e : array) {
                if (e.length() > maxLen.length()) {
                    maxLen = e;
                }
            }

            System.out.print(maxLen);
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод");
        }
    }

    public static double getNumber() {
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
        System.out.println("Выберите номер операции:\n1 - прибавить\n2 - отнять\n3 - умножить\n4 - разделить");
        int operationNumber = 0;
        if (sc.hasNextInt()) {
            operationNumber = sc.nextInt();
        } else {
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
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double mul(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        if (num2 != 0.0) {
            return num1 / num2;
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