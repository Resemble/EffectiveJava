package Reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ranran
 * @version V1.0
 * @Title:
 * @Package Reflect
 * @Description:      http://www.cnblogs.com/rollenholt/archive/2011/09/02/2163758.html 继续
 * @date 2017/7/17 19:03
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object obj = null;

    public Object bind(Object obj) {

        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);

    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object temp = method.invoke(this.obj, args);
        return temp;
    }

}

class Hello {

    public static void main(String[] args) {

        MyInvocationHandler demo = new MyInvocationHandler();
        Subject sub = (Subject) demo.bind(new RealSubject());
        String info = sub.say("Resemble", 22);
        System.out.println(info);

    }

}
