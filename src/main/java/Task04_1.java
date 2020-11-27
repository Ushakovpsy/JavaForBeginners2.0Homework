/**
 * * Задание №4.1
 * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
 *
 * @author Oleg Ushakov
 */

public class Task04_1 {

    public static void main(String[] args) {
        int arrayRandom[] = new int[20];

        //создаем массив и выводим на экран
        System.out.println("Выводим массив на экран:");
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (int) (Math.random() * 21 - 10);
            System.out.print(arrayRandom[i] + "  ");
        }

        //ищем миниммальное и максимальное значения. хатем печатаем их
        System.out.println("\n" + "\n" + "Максимальный отрицательный и минимальный положительный элементы массива");
        int maxValue = arrayRandom[0];
        int minValue = arrayRandom[0];

        for (int value : arrayRandom) {

            if (value > maxValue) {
                maxValue = value;
            }

            if (value < minValue) {
                minValue = value;
            }
        }

        System.out.println("maxValue" + " " + maxValue + ";" + " " + "minValue" + minValue);

        //Находим индекс максимального значения
        int max = arrayRandom[0];
        int indexForMax = 0;
        for (int i = 0; i < arrayRandom.length; i++) {
            int score = arrayRandom[i];
            if (max < score) {
                max = score;
                indexForMax = i;
            }
        }

        //Находим индекс минимального значения и выводим на экран
        System.out.println("\n" + "Индексы максимального отрицательного и минимального положительного элементов массива");
        int min = arrayRandom[0];
        int indexForMin = 0;
        for (int i = 0; i < arrayRandom.length; i++) {
            int score = arrayRandom[i];
            if (min > score) {
                min = score;
                indexForMin = i;
            }
        }

        System.out.println("indexForMin" + " " + indexForMin + ";" + " " + "indexForMax" + " " + indexForMax);

        //меняем индексы местами
        int a = 0;
        a = arrayRandom[indexForMin];
        arrayRandom[indexForMin] = arrayRandom[indexForMax];
        arrayRandom[indexForMax] = a;

        //печатаем массив с индкесами, поменяными местами
        System.out.println("\n" + "После перемены местами индексов массив выглядит так");
        for (int i = 0; i < arrayRandom.length; i++) {

            System.out.print(arrayRandom[i] + "  ");
        }
    }
}