package pro190630;
// Java中所有类的直接或者间接父类都是Object
/*
这两种书写方式是等价的，系统默认继承，可省略
public class DemoF extends Object { }
 */
public class DemoF {
    public static void main(String[] args) {
        Object obj = new DemoF();
        Object obj2 = new DemoF();
        // 获取当前对象的类型
        Class c = obj.getClass();
        System.out.println(c);
        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());
        // 比较两个对象之间的地址是否相等（String的equals方法被重写过）
        boolean b = obj.equals(obj2);// 这两条语句等价
        boolean b2 = obj==obj2;
        System.out.println(b);
        System.out.println(b2);
        // 返回内存的哈希码
        int hashCode = obj.hashCode();
        System.out.println(hashCode);
        // 返回对象的字符串表示形式
        String str = obj.toString();// 类名+@+十六进制hashCode
        System.out.println(str);
        /*
        注意：以下方法都是受保护（不在一个包中无法调用）的方法，直接使用会有异常
        以当前的对象复制一个新对象
        clone()——创建一个对象的新的副本
        Object obj3 = obj.clone();

        调用JVM的垃圾回收，但是JVM不会立即清理，程序员无法控制
        finalize()——垃圾回收器准备释放内存的时候，会先调用finalize()
        obj.finalize();
         */
    }
}
