package pro190908;
// 其他类
public class DemoD {
    public static void a() {
    /*
    Math类是一个最终类，构造器是私有的，所以不能new对象，方法都是静态方法，所以可以用类直接引用
     */
        double random = Math.random();// [0,1)的随机数
        // 注意：虽然是取整，但是返回类型还是double
        double num11 = Math.floor(9.789);// 向下取整
        double num12 = Math.floor(9.489);
        double num21 = Math.round(9.789);// 四舍五入
        double num22 = Math.round(9.489);
        double num31 = Math.ceil(9.789);// 向上取整
        double num32 = Math.ceil(9.489);
        System.out.println(random);
        System.out.println(num11+"\t"+num12);
        System.out.println(num21+"\t"+num22);
        System.out.println(num31+"\t"+num32);
        double e = Math.E;// 自然对数的底数
        double pi = Math.PI;// 圆周率
        System.out.println(e);
        System.out.println(pi);
    }

    public static void b() {
        String s = "029";
        int num = Integer.parseInt(s);// 将字符串转换成整型，可以带 + - 符号，自动去掉前面的0，不能出现别的符号，会报异常
        System.out.println(s);
        System.out.println(s+1);
        System.out.println(num);
        System.out.println(num+1);
        String a = "-029";
        int aa = Integer.parseInt(a);
        System.out.println(a);
        System.out.println(aa);
        System.out.println(aa+1);

        String s2 = "101";
        // radix为指定s2是什么基数，也就是本身为什么进制（范围为2到36，默认为10），然后将其转换为十进制数
        int num2 = Integer.parseInt(s2,2);
        System.out.println(num2);
        String s3 = "AbCd";// 可以计算十六进制数，不区分字母大小写
        /*
        注意：当处于十一进制到十六进制之间，或者十六进制以上时
            是可以使用对应的字母的，也就意味着十六进制以后，可以使用F（f）以后的字母
         */
        int num3 = Integer.parseInt(s3,16);
        System.out.println(num3);
    }

    public static void c() {
        //Object obj = new Object();
        Object obj = "abc";
        Class c = obj.getClass();// 获取对象运行时对象的类
        String str = obj.toString();// 返回对象的字符串表示形式
        int hashCode = obj.hashCode();// 获取对象的 hash 值
        boolean b = obj.equals("aaa");// 比较两个对象（地址）是否相等
        // protected Object clone() 创建并返回一个对象的拷贝（此方法受保护，无法使用）
        /*
        protected void finalize()
        当GC（垃圾回收器）确定不存在对该对象有更多的引用时，由对象的垃圾回收器调用此方法（此方法受保护，无法使用）
         */
        // 这三个方法会抛出异常
        //obj.wait();// 让当前线程进入等待状态，直到其他线程调用此对象的notify()方法或notifyAll()方法
        //obj.notify();// 唤醒在该对象上等待的某个线程
        //obj.notifyAll();// 唤醒在该对象上等待的所有线程
        System.out.println(c);
        System.out.println(str);
        System.out.println(hashCode);
        System.out.println(b);
    }

    public static void main(String[] args) {
        //a();
        //b();
        //c();
    }
}
/*
1.Java中有哪些常用类？
2.字符串类有哪些？他们之间的区别？
3.如何获取时间？
4.怎么进行取整操作？
5.如何进行字符串类型与整型类型的转换？
 */
