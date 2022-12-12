package StepsLogin;

import Base.BaseUtil;
import io.cucumber.java.Before;

public class Hooks extends BaseUtil {


    private BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void setUp(){

    }

}
