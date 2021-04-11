package Chapter5;

import java.util.Arrays;

public class ArratDemo {
    public static void main(String[] args) {
        var a = new int[10];
        a= Arrays.copyOf(a,2*a.length);
        System.out.println(a.length);
    }
}
