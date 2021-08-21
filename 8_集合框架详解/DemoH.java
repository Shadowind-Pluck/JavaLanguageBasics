package pro191108;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

// 集合框架Set接口——TreeMap类
public class DemoH {
    public static void a() {
        TreeMap<String,Integer> map = new TreeMap<>();// 红黑树
        map.put("A",58);// 放进去58，起个别名叫"A"
        map.put("B",44);
        map.put("A",34);// 因为这个键集和第一个键集都是"A"，所以这个"A"会覆盖掉第一个"A"
        map.put("C",44);// 值集可以重复
        map.put("D",null);
        System.out.println(map);
        int num = map.get("A");// 从集合里边取东西（注意：TreeSet没有此方法）
        System.out.println(num);
        int size = map.size();// 得到集合的元素个数
        Set<String> set = map.keySet();// 获取键集
        Collection<Integer> list = map.values();// 获取值集，List接口的父类就是Collection接口
    }
    /**
     * 值集可以重复，可以存放null（List结构）
     * 键集不能重复，重复值会覆盖掉原值，不报异常（红黑树结构）
     */

    public static void main(String[] args) {
        a();
    }
}
