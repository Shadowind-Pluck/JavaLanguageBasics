package pro191108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 集合框架List接口——ArrayList类

/**
 * ArrayList是List接口下的实现类，ArrayList是线性队列式结构（数组）
 * 优点：查询速度快
 * 缺点：插入、删除速度慢
 * ArrayList最常用
 */
public class DemoA {
    public static void a() {
        // Object[] elementData = {};
        List<String> list = new ArrayList<>();// 产生一个长度为零的空集合
        list.add("陕西");// 向集合中添加内容，依次从集合末尾添加
        list.add("浙江");
        list.add("山东");
        list.add("福建");
        //list.add(3);// 报错，参数类型不符
        list.add(2,"湖北");// 向指定索引处插入元素，注意不是替换
        System.out.println(list);
    }

    public static void b() {
        int[] arr = {1,2,3,0,0,0,0,0};
        System.arraycopy(arr,1,arr,2,2);
        arr[1] = 4;
        System.out.println(Arrays.toString(arr));
    }

    public static void c() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        List<String> list2 = new ArrayList<>(7);
        List<String> list3 = new ArrayList<>(list1);
        System.out.println(list3);
    }

    public static void d() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        list.add(11);// 从这里开始扩容，从10扩容到15（oldCapacity + (oldCapacity >> 1)），10 >> 1 = 5
    }

    public static void e() {
        List<String> list = new ArrayList<>();
        list.add("陕西");
        list.add("浙江");
        list.add("山东");
        list.add("福建");

        int len = list.size();// 注意：size是当前集合中元素的个数，length是当前集合的容量
        String str = list.get(2);
        list.set(1,"广东");
        list.remove(1);// 删除指定索引处的元素，后续元素向前位移
        list.remove("山东");// 删除遇到的第一个指定内容的元素，后续元素向前位移
    }

    public static void f1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // 判断元素在集合中是否存在
        boolean b = list.contains(3);
        // 找出元素3在集合中第一次出现的位置，不存在返回-1
        int index1 = list.indexOf(3);
        // 找出元素3在集合中最后一次出现的位置，不存在返回-1
        int index2 = list.lastIndexOf(3);
        System.out.println(b);
        System.out.println(index1);
        System.out.println(index2);
    }

    public static void f2() {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person(1,"张三",22);
        Person p2 = new Person(2,"李四",23);
        Person p3 = new Person(3,"王五",21);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println(list);

        Person p4 = new Person(2,"李四",23);
        boolean b = list.contains(p4);// 结果为false
        System.out.println(b);
        /*
        注意：在解决实际问题时，无法得知集合中的内容
                所以查询时，只能new出一个新对象，以其为模板来进行查询
        解决方法：contains()方法本质是用equals()方法来比较地址，所以需要重写equals()方法
        特别注意：需要重写的是Person类的equals()方法，不是本类
         */
    }

    public static void f3() {
        List<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(13);
        list.add(15);
        list.add(11);
        list.add(17);
        System.out.println(list);
        /*
        Integer可以直接排序的原因，Integer这个类实现了Comparable接口下的compareTo()方法
         */
        Collections.sort(list);// 排序方法：升序
        System.out.println(list);
    }

    public static void f4() {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person(1,"张三",22);
        Person p2 = new Person(2,"李四",23);
        Person p3 = new Person(3,"王五",21);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println(list);
        Collections.sort(list);// 重写了Person类的compareTo()方法
        System.out.println(list);
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        //a();
        //b();
        //c();
        //d();
        //e();
        //f1();
        //f2();
        //f3();
        //f4();
    }
}
/*
    1.ArrayList就是一个Object[]
    2.ArrayList的结构是线性队列式结构，也就是传说中的动态数组
    3.在向数组中添加元素时，有可能会涉及到扩容问题
 */
