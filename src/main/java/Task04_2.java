import gift.Biscuit;
import gift.Macaroon;
import gift.Muffin;
import gift.Sweets;

/**
 * * Задание №4.2
 * Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 *
 * @author Oleg Ushakov
 */

public class Task04_2 {

    public static void main(String[] args) {

        double totalWeight = 0;
        double amount  = 0;

        Biscuit biscuit1 = new Biscuit ("Юбилейное", 1.5, 50, "Очень вкусный");
        Macaroon macaroon1 = new Macaroon("Макаронина", 10, 2500, "Розовый");
        Muffin muffin1 = new Muffin("Просто маффин", 1, 600, "Средних размеров");

        Sweets [] gift = {biscuit1, macaroon1, muffin1};

        for (Sweets someSweets : gift){
            System.out.println(someSweets.toString());
        }

        totalWeight = biscuit1.getWeight() + macaroon1.getWeight() + muffin1.getWeight();
        amount = biscuit1.getPrice() + macaroon1.getPrice() + muffin1.getPrice();
        System.out.println("Общий вес подарка = [" + totalWeight + "] кг");
        System.out.println("Общая стоимость подарка = [" + amount + "] руб.");
    }
}