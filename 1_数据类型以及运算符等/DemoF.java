package pro190519;

// 三目运算符
// expr1?expr2:expr3;
// 如果表达式1为真，则总表达式值为表达式2，否则为表达式3
public class DemoF {
    public static void main(String[] args) {
        int a,b;
        a = (int)(Math.random()*10+1);
        b = (int)(Math.random()*10+1);
        int c = a>b?a:b;
        // +的作用：求和（ + 号两边都是数值类型求和，注意char也是数值）、拼接（有一方为非数值类型）
        System.out.println(1+'a');
        // 几 大于 几 是否成立
        System.out.println(a+"大于"+b+"是否成立："+(a>b));
        System.out.println(c);
    }
}
