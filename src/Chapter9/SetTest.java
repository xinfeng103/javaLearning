package Chapter9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.System.in;

public class SetTest {
    public static void main(String[] args) {
        var words = new HashSet<String>();
        long totalTime = 0;

        try (var in = new Scanner(System.in)) {
            while (in.hasNext()) {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis();
                totalTime += callTime;
            }
        }

        Iterator<String> iter = words.iterator();
        for (int i = 1; i <= 20; i++) {
            System.out.println(iter.next());
        }
        System.out.println("...");
        System.out.println(words.size() + "distinct words. " + totalTime + "milliseconds.");
    }
}
