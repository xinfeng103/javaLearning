package Chapter5;

import java.lang.reflect.*;
import java.util.Random;
import java.util.Scanner;

public class Reflection {
    //运行时类型标识，Class类

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            var in = new Scanner(System.in);
            System.out.println("Enter class name(e. g. java.util.Date):");
            name = in.next();
        }
        Class cl = Class.forName(name);
        Class supercl = cl.getSuperclass();
        String modifiers = Modifier.toString(cl.getModifiers());
        if (modifiers.length() > 0) {
            System.out.println(modifiers + " ");
        }
        System.out.println("class" + name);
        if (supercl != null && supercl != Object.class) {
            System.out.println("extends" + supercl.getName());
        }
        System.out.println("\n{\n");
        printConstructors(cl);
        printMethods(cl);
        printFields(cl);
    }

    private static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.println("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.println(modifiers + " ");
            }
            System.out.println("class" + name);
        }
    }

    private static void printMethods(Class cl) {
        Method[] methods = cl.getMethods();
        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.println("    ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.println(modifiers + " ");
            }
            System.out.println(retType.getName() + " " + name + "(");

            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.println(paramTypes[j].getName());
                }
                System.out.println(");");
            }
        }
    }

    private static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getConstructors();
        for (Constructor c : constructors) {
            String name = c.getName();
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.println(modifiers + " ");
            }
            System.out.println(name + "(");
            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.println(paramTypes[j].getName());
                }
                System.out.println(");");
            }
        }
    }


    private void func1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        HashCode h = new HashCode("liang", 18);//前面自己定义的学习hashcode的类，有名字和年龄两个实例字段
        Class clazz = h.getClass();
        System.out.println(clazz.getName() + " " + h.getName());

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
