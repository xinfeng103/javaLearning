package Chapter9;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        var parts = new TreeSet<Item>();
        parts.add(new Item("Toaster",1234));
        parts.add(new Item("Widget",4562));
        parts.add(new Item("Modem",9912));
        System.out.println(parts);
        var sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
        System.out.println(parts);
    }


    private void func() {
        var sorter = new TreeSet<String>();
        sorter.add("Bob");
        sorter.add("Amy");
        sorter.add("Carl");
        for (String s : sorter) {
            System.out.println(s);
        }
    }
}
