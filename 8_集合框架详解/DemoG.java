package pro191108;

import java.util.Arrays;
import java.util.TreeSet;

// 集合框架Set接口——TreeSet类
public class DemoG {
    public static void a() {
        // TreeSet只关心key，不关心value，value都是PRESENT（Object类型的一个常量）
        TreeSet<Integer> set = new TreeSet<>();// 红黑树
        set.add(23);// 添加
        set.add(12);
        set.add(17);
        set.add(25);
        // 输出为中序遍历（中序遍历根结点的左子树，然后是访问根结点，最后遍历右子树）
        System.out.println(set);
        set.remove(22);// 删除
        System.out.println(set);
        // 注意：没有修改和查询
        int len = set.size();// 测量长度
        System.out.println(len);
        boolean b = set.contains(19);// 查询有没有19这个元素（利用compareTo()方法进行查找）
        System.out.println(b);
        Object[] arr = set.toArray();// 将其转化为数组
        System.out.println(Arrays.toString(arr));
    }
    /**
     * TreeSet不允许存放null值
     * TreeSet不允许存放重复值，重复值会覆盖掉原值（不报异常）
     */

    public static void b() {
        TreeSet<Users> set = new TreeSet<>();
        /**
         * TreeSet中的元素支持2种排序方式：
         * 自然排序或者根据创建TreeSet时提供的Comparator进行排序，这取决于使用的构造方法。
         */
        Users u1 = new Users(1,"aa",21);
        Users u2 = new Users(2,"bb",15);
        Users u3 = new Users(3,"cc",25);
        set.add(u1);// 必须重写Comparable接口的compareTo()方法，否则无法添加
        set.add(u2);
        set.add(u3);
        System.out.println(set);
        Users u4 = new Users(2,"dd",15);
        boolean b = set.contains(u4);// 根据重写的compareTo()方法进行检测
        System.out.println(b);
        set.add(u4);// s4不会进去，根据重写的compareTo()方法进行检测
        System.out.println(set);

        System.out.println(u2.equals(u4));// 根据重写的equals()方法进行比较
        System.out.println(u2 == u4);// 比较地址
    }

    public static void main(String[] args) {
        //a();
        //b();
    }
}
