package pro191108;

import java.util.Collections;
import java.util.LinkedList;

// 集合框架List接口——LinkedList类
public class DemoF {
    public static void a() {
        // 两种构造器
        // 注意：创建LinkedList对象时，不能将类型声明为List接口，否则无法使用LinkedList特有的方法

        // 产生一个空集合（双向链表），而ArrayList是空集合（数组）
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>(list1);// 复制list1到list2
        list1.add("陕西");
        list1.add("湖北");
        list1.add("浙江");// 有返回值，返回true
        list1.addLast("福建");// 无返回值，除此之外与add()一样
        list1.addFirst("甘肃");// 将元素添加到链表首，成为首结点，没有返回值
        list1.add(3,"四川");// 插入到对应索引处，无返回值
        System.out.println(list1);
        //list1.remove("甘肃");
        //list1.remove(1);// 按照索引删除
        //list1.removeFirst();// 删除第一个
        //list1.removeLast();// 删除最后一个
        //list1.remove();// 删除第一个，就是调用的removeFirst()方法
        //list1.removeFirstOccurrence("陕西");// 删除第一次出现的指定元素（从头到尾编历列表）
        //list1.removeLastOccurrence("陕西");// 删除第一次出现的指定元素（从头到尾编历列表）
        String str1 = list1.get(2);// 得到索引处的元素
        String str2 = list1.getFirst();// 得到第一个元素
        String str3 = list1.getLast();// 得到最后一个元素
        list1.set(2,"云南");// 修改索引处的值
        int size = list1.size();// 获取长度
        Object[] array = list1.toArray();// 将链表转变为数组
    }

    public static void b() {
        LinkedList<Student> list = new LinkedList<>();
        Student s1 = new Student(1,"aa",21);
        Student s2 = new Student(2,"bb",23);
        Student s3 = new Student(3,"cc",22);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Student s4 = new Student(4,"bb",22);
        boolean b = list.contains(s4);// 重写了equals()方法，比较stuId
        System.out.println(b);
        System.out.println(list);
        Collections.sort(list);// 重写了Comparable接口下的compareTo()方法，比较stuAge
        System.out.println(list);
    }

    public static void main(String[] args) {
        //a();
        //b();
    }
}
