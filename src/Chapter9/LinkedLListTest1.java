package Chapter9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLListTest1 {
    public static void main(String[] args) {
        var a = new LinkedList<String>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        var b = new LinkedList<String>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        ListIterator<String> itA = a.listIterator();
        Iterator<String> itB = b.iterator();

        while (itB.hasNext()){
            if(itA.hasNext()) itA.next();
            itA.add(itB.next());
        }

        System.out.println(a);

        itB =  b.iterator();
        while (itB.hasNext()){
            itB.next();
            itB.remove();
        }
        System.out.println(b);

        a.removeAll(b);
        System.out.println(a);
    }
}
