package pro190519;
// 引入出处
import java.util.Scanner;
// 运算符
public class DemoC {
    public static void main(String[] args) {
        int a,b;
        // 创建一个键盘对象
        Scanner sc = new Scanner(System.in);
        // 赋值运算符 =
        a = sc.nextInt();// 接收输入的int类型值给变量a
        b = sc.nextInt();// 接收输入的int类型值给变量b
        // 算术运算符 + - * / %
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        // 关系运算符：得到的结果一定是一个boolean类型的结果 > >= < <= == !=
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);
        // 逻辑运算符：得到的结果一定是一个boolean类型的结果 || && !
        // 逻辑运算符的优先级比关系运算符的优先级低，但是 ! 的优先级却比算术运算符还高
        System.out.println(a>=b&&a<=b);
        System.out.println(a>b||a<b);
        System.out.println(!(a>b));
    }
}
