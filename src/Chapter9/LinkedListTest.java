package Chapter9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        var staff = new LinkedList<String>();
        staff.add("Amy");
        staff.add("Bpb");
        staff.add("Carl");
        ListIterator<String> iter = staff.listIterator();
        System.out.println(iter.next());
        iter.add("Juliet");
        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.previous());
        System.out.println(iter.previous());
        System.out.println(iter.previous());
        System.out.println(staff);
        System.out.println(staff.contains("Carl"));
    }

    private static void func1(){
        var staff = new LinkedList<String>();
        staff.add("Amy");
        staff.add("Bpb");
        staff.add("Carl");
        Iterator<String> iter = staff.iterator();
        String first = iter.next();
        String second = iter.next();
        iter.remove();
        System.out.println(first+"\n"+second);
        System.out.println(iter.next());
    }
}


