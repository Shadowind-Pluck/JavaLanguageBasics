package pro191108;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

// 集合框架List接口——Vector类
public class DemoD {
    public static void a() {
        List<Integer> vector = new Vector<>();
        vector.add(22);
        vector.add(21);
        vector.add(1,29);
        System.out.println(vector);
        int num = vector.get(1);
        System.out.println(num);
        //vector.remove(1);

        //特殊：这两种方法是删除指定元素，但是类型冲突时的应对方法（索引类型与元素类型相同），第一种正规，推荐
        //vector.remove(new Integer(29));
        //vector.remove((Integer) 29);
        System.out.println(vector);
        vector.set(1,15);
        boolean b = vector.contains(21);
        int index1 = vector.indexOf(22);
        int index2 = vector.lastIndexOf(17);
        System.out.println(vector);
        System.out.println(b);
        System.out.println(index1);
        System.out.println(index2);
        Object[] array = vector.toArray();
        System.out.println(Arrays.toString(array));
        Collections.sort(vector);
        System.out.println(vector);
    }

    public static void main(String[] args) {
        a();
    }
}
