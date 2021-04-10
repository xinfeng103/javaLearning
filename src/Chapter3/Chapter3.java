package Chapter3;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class Chapter3 {

    enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}

    public static void main(String[] args) throws IOException {
        array();
    }

    public static void array(){
        int[] arr ={1,4,3};
        System.out.println(Arrays.toString(arr));
        int[] arr1 = arr;
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1==arr);
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr==arr2);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.binarySearch(arr,3));
//        System.out.println(Arrays.binarySearch(arr2,3));//无序，不可以二分查找
        Arrays.fill(arr2,1);
        System.out.println(Arrays.toString(arr2));

        int[][] twoArr={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(twoArr));
    }

    public static void bignum(){
        BigInteger a = BigInteger.valueOf(100);
        BigInteger reallyBig = new BigInteger("31798379824738247924782364927489264893628946");
        System.out.println(reallyBig);
        System.out.println(reallyBig.add(BigInteger.ONE));
        System.out.println(a.compareTo(reallyBig));
        System.out.println(reallyBig.compareTo(a));
    }

    public static void fileInOut() throws IOException {
        //写文件，如果不存在就新建文件，最后一步关闭要写上
        PrintWriter out= new PrintWriter("myfile.txt", StandardCharsets.UTF_8);
        out.println("hello file");
        out.close();
        //读文件
        Scanner in = new Scanner(Path.of("myfile.txt"),StandardCharsets.UTF_8);
        System.out.println(in.nextLine());
        //定位当前目录
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
    }

    public static void input(){
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(name);

//        Console cons = System.console();
//        String username = cons.readLine("nme:");
//        char[] password = cons.readPassword("password");
    }
    public static void stringBuilder(){
        //StringBuffer 多线程，线程安全，效率低
        //StringBuilder 单线程，效率高
        StringBuilder builder=new StringBuilder();
        builder.append("hello");
        builder.append(" java.");
        String str = builder.toString();
        System.out.println(str);
        System.out.println(builder);
        System.out.println(builder.length());
        builder.setCharAt(0,'H');
        System.out.println(builder);
    }

    public static void string() {
        String str = "hello";
        String s = str.substring(1, 3);
        System.out.println(s);

        String all = String.join("# ", "a", "b", "c");
        System.out.println(all);

        String repeated = "Java".repeat(3);
        System.out.println(repeated);

        String str1 = "hello";
        String str2 = new String("hello");
        String str4 = "Hello";
        System.out.println(str==str1);
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str4));

        String s1= "hello java";
        System.out.println(s1.charAt(0));
    }

    public static void func1() {
        Size s = Size.MEDIUM;
        System.out.println(s);
        System.out.println("Hello");
        System.out.println(0b1001);
        System.out.println(1_000_000);
        byte b = (byte) 254;
        System.out.println(b);
        int b1 = Byte.toUnsignedInt(b);
        System.out.println(b1);

        float f = 3.14f;
        double d = 3.14d;
        double d2 = Double.POSITIVE_INFINITY;
        System.out.println(d2);
        double d3 = Double.NaN;
        System.out.println(d3);
        double d4 = Double.NEGATIVE_INFINITY;
        System.out.println(d4);

        System.out.println('\u0065');

        final var π = 3.14;
        System.out.println(π);
        System.out.println(Character.isJavaIdentifierStart('π'));
        System.out.println(π / 0);
    }

    public static void func2() {
        int x = 4;
        double y = Math.sqrt(x);
        System.out.println(y);
        System.out.println(Math.PI);
        double z = pow(2, -1);
        System.out.println(z);
//        x=x+3.5;
        System.out.println(x += 3.5);  //自动强转

        int a = 1, b = 0;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~b);
    }
}
