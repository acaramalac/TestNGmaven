package samples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

    @Test(groups = {"unit"})
    public void first(){
        System.out.println("123");
    }

    @Test(groups = {"web"})
    public void second(){
        System.out.println("2");
        Assert.assertEquals("1", "2");
    }

    @Test(groups = {"db"})
    public void third(){
        System.out.println("3");
    }
}
