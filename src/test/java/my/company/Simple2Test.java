package my.company;

import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

/**
 * @author baev (Dmitry Baev)
 */
public class Simple2Test {

    @Test
    public void simpleTest2() {
        step("step2 1");
        step("step2 2");
    }
}
