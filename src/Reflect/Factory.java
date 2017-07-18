package Reflect;

import java.io.*;
import java.util.Properties;

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

// 操作属性文件类
class init {
    public static Properties getPro() throws FileNotFoundException, IOException {
        Properties properties = new Properties();
        File file = new File("fruit.properties");
        if(file.exists()) {
            properties.load(new FileInputStream(file));
        } else {
            properties.setProperty("apple", "Reflect.Apple");
            properties.setProperty("orange", "Reflect.Orange");
            properties.store(new FileOutputStream(file), "FRUIT CLASS");
        }
        return properties;
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


class Hello3 {
    public static void main(String[] args) {
        try {
            Properties properties = init.getPro();
            Fruit fruit = Factory.getInstance(properties.getProperty("apple"));
            if (fruit != null) {
                fruit.eat();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}