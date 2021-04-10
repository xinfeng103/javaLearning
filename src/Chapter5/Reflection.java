package Chapter5;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class Reflection {
    //运行时类型标识，Class类

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        HashCode h = new HashCode("liang",18);//前面自己定义的学习hashcode的类，有名字和年龄两个实例字段
        Class clazz = h.getClass();
        System.out.println(clazz.getName()+" "+h.getName());

        Class cl1 = Random.class;
        System.out.println(cl1);
        Class cl2 = int[].class;
        System.out.println(cl2);
        Class cl3 = Double[].class;
        System.out.println(cl3);

        var ClassName = "java.util.Random";
        Class cl4 = Class.forName(ClassName);//
        Object obj = cl4.getConstructor().newInstance();

    }

}
