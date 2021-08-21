package pro191108;

import java.util.Stack;

// 集合框架List接口——Stack类
public class DemoE {
    public static void a() {
        // 注意：创建Stack对象时，不能将类型声明为List接口，否则无法使用Stack的特有方法
        Stack<String> stack = new Stack<>();
        boolean b = stack.add("aaa");// 有返回值，返回true（ArrayList也有）
        stack.add(0,"bbb");
        // 两个方法的区别
        String str = stack.push("ccc");// 有返回值，返回参数——"ccc"
        System.out.println(str);
        //stack.remove("aaa");
        //stack.remove(1);
        stack.set(1,"ddd");
        System.out.println(stack);
        String str1 = stack.get(2);
        String str2 = stack.pop();// 获取最后一个元素，并删除
        String str3 = stack.peek();// 获取最后一个元素
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

    public static void main(String[] args) {
        a();
    }
}
