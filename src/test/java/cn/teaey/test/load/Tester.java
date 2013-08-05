package cn.teaey.test.load;
import org.junit.Test;
/**
 * User: Teaey
 * Date: 13-8-5
 */
public class Tester
{
    @Test
    public void init()
    {
        Main.init(10000);
    }
    @Test
    public void load()
    {
        Main.load(1, 100);
    }
    @Test
    public void sizeof()
    {
        Main.sizeof(1, 10000);
    }
}
