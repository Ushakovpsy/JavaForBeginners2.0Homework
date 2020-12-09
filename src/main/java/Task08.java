import org.junit.Assert;
import org.junit.Test;

/**
 * * Задание №8
 * Покрыть Unit тестами последний проект с калькулятором
 *
 * @author Oleg Ushakov
 */

public class Task08 {
    Task05 calculator = new Task05();


    @Test
    public void testSum() throws Exception {
        double result = calculator.add(2, 2);
        if (result != 4) {
            Assert.fail();
        }
    }


    @Test
    public void testSubtract() throws Exception {
        double result = calculator.sub(2, 2);
        if (result != 0) {
            Assert.fail();
        }
    }

    @Test
    public void testMultiply() throws Exception {
        double result = calculator.mul(-2, 1.9);
        if (result != -3.8) {
            Assert.fail();
        }
    }

    @Test
    public void testDivide() throws Exception {
        double result = calculator.div(320, 2);
        if (result != 160) {
            Assert.fail();
        }
    }
}