package Reflect;

/**
 * @author ranran
 * @version V1.0
 * @Title:
 * @Package Reflect
 * @Description:
 * @date 2017/7/18 10:24
 */
public class Factory {

    public static Fruit getInstance(String className) {
        Fruit fruit = null;
        try {
            fruit = (Fruit)Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return fruit;
    }

}

class Hello2 {
    public static void main(String[] args) {
        Fruit fruit = Factory.getInstance("Reflect.Apple");
        if (fruit != null) {
            fruit.eat();
        }

        Fruit orange = Factory.getInstance("Reflect.Orange");
        orange.eat();

    }
}