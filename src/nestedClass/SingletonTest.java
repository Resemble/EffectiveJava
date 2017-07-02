package nestedClass;

/**
 * @author ranran
 * @version V1.0
 * @Title:
 * @Package InnerClass
 * @Description:
 * @date 2017/7/2 12:05
 */
public class SingletonTest {
    private static SingletonTest ourInstance = new SingletonTest();

    public static SingletonTest getInstance() {
        return ourInstance;
    }

    private SingletonTest() {
    }
}
