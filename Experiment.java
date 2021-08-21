import java.util.Arrays;
import java.util.Scanner;

public class Experiment {
    public static void a() {
        int[] array = new int[10];
        System.out.println(array.toString());
        System.out.println(Arrays.toString(array));
    }

    public static void b() {
        int[] ints = new int[10];// 全为0
        System.out.println(Arrays.toString(ints));
        byte[] bytes = new byte[10];// 全为0
        System.out.println(Arrays.toString(bytes));
        String str2 = new String(bytes);// 空字符串
        System.out.println(str2);
        char[] chars = new char[10];// 全为null
        System.out.println(Arrays.toString(chars));
        String str3 = new String(chars);// 空字符串
        System.out.println(str3);
    }

    public static void c() {
        char[] chars = {'a','b','c'};
        byte[] bytes = {97,98,99};
        String str1 = new String(chars,0,1);
        System.out.println(str1);
        String str2 = new String(bytes,0,1);
        System.out.println(str2);
    }

    public static void d() {
        String str1 = new String();
        String str2 = new String("");
        String str3 = "";
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
    }

    // 当在方法外使用输入对象时，必须让其给变量赋值（方法内没做要求）
    Scanner sc = new Scanner(System.in);
    //sc.nextInt();// 这样书写错误
    int a = sc.nextInt();
    public void e() {
        sc.nextInt();// 这样书写没问题
        System.out.println(a);
    }

    public static void main(String[] args) {
        //a();
        //b();
        //c();
        //d();
        //new Experiment().e();
    }
}
