package Reflect;

/**
 * @author ranran
 * @version V1.0
 * @Title:
 * @Package Reflect
 * @Description:
 * @date 2017/7/17 19:01
 */
public class RealSubject implements Subject {


    @Override
    public String say(String name, int age) {
        return name + " " + age;
    }

}
