package my.company;

import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

/**
 * @author baev (Dmitry Baev)
 */
public class SingleThreadTest {

    @Test
    public void single() {
        step("single step 1");
        step("single step 2");
    }
}
