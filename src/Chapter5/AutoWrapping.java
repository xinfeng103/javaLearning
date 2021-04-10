package Chapter5;

public class AutoWrapping {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);
        System.out.println(a.toString());
        Integer c = 1000;
        Integer d = 1000;
        System.out.println(c == d);

//        Integer n = null;
//        System.out.println(2*n);

        String s = "123";
        int x = Integer.parseInt(s); //静态方法
        System.out.println(x);

        String t = "1001";
        int y = Integer.parseInt(t,2);
        System.out.println(y);

    }
}
