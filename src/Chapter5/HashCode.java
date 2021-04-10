package Chapter5;

import java.util.HashMap;
import java.util.Objects;

public class HashCode {
    private String name;
    private int age;

    public HashCode(){}
    public HashCode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HashCode)) return false;
        HashCode hashCode = (HashCode) o;
        return age == hashCode.age && name.equals(hashCode.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return this.getClass().getName()+
                "{name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        HashCode h = new HashCode("liang",18);
        System.out.println(h.toString());
        System.out.println(h);
        System.out.println(""+h);
        Character c = 's';
        System.out.println(c.hashCode());
        System.out.println(Character.hashCode('s'));

        var s = "ok";
        var sb = new StringBuilder(s);
        System.out.println(s.hashCode() + " " + sb.hashCode());

        var t = new String("ok");
        var tb = new StringBuilder(t);
        System.out.println(t.hashCode() + " " + tb.hashCode());
    }
}
