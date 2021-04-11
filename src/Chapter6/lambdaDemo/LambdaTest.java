package Chapter6.lambdaDemo;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;
import java.util.function.BiFunction;

public class LambdaTest {
    public static void main(String[] args) {
        var planets = new String[]{
                "mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune",
        };
        System.out.println(Arrays.toString(planets));

        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

//        var timer = new Timer(1000, event -> System.out.println("The time is " + new Date()));
//        timer.start();
//        JOptionPane.showMessageDialog(null, "Quit program");
//        System.exit(0);
//
//        BiFunction<String,String,Integer> comp = (first,second)->first.length()-second.length();
////        Arrays.sort(planets,comp);
//
//        var t = new Timer(1000,System.out::println);

        Arrays.sort(planets,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(planets));
    }
}
