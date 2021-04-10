package Chapter5;

import java.util.ArrayList;

public class GenericArr_ArrayList {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>();
        var arr1 = new ArrayList<Integer>(10); //初始化容量，随着元素增多，如果容量不够了，数组会自动扩容。初始化可省略
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr.ensureCapacity(20); //初始化容量
        arr.add(1);
        arr.add(3);
        arr.add(9);
        arr.add(5);
        System.out.println("arr.size  "+arr.size()+" "+"\n"+"arr1.size  "+arr1.size());

        arr.trimToSize();//削减数组容量到实际长度，最好确定数组不会再增长了再调用这个方法，不然后面添加元素的时候还要再扩容，重新分配空间

        System.out.println(arr.get(0));//java没有运算符重载，不能用[]访问数组元素，可以用.get获取

        // add添加元组
        // set修改元素
        // get获取元素
        // remove删除元素
    }
}
