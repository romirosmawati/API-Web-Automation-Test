package web.Util;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import static web.Util.BaseTest.*;

public class Hooks {

    @Before
    public static void beforeTest() {
        setupDriver();
    }

    @After
    public static void afterTest() {
        closeDriver();
    }
}
