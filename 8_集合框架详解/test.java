package pro191108;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理问题：
 * 当list中存放的是int类型的数据时，执行remove()方法导致索引和对象混淆的问题的处理方法
 */
public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<10;i++){
            list.add(i+10);
        }
        System.out.println(list);
        // 报错，remove()方法将参数识别为索引，导致提醒索引越界异常
        //list.remove(15);
        list.remove((Integer) 15);// 正确书写方法

        // 另外一种解决方法（正规）
        list.remove(new Integer(13));// 注意要用Integer，int原始数据类型不能new
        System.out.println(list);
    }
}
