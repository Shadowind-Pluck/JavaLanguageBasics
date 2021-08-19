package pro190525;

import java.util.Scanner;

public class DemoE {
    // 任意输入五个数，判断这些数之间是否有重复内容
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        /*
        虽然处理这个问题的方法很傻逼，但是自己更傻逼
        居然想着把每种可能都用if实现，但是实际上问题只有两种，就是有或者没有
        一条if-else语句就可以实现
         */
        if(a==b||a==c||a==d||a==e||b==c||b==d||b==e||c==d||c==e||d==e){
            System.out.println("有重复数字！");
        }else{
            System.out.println("没有重复数字！");
        }
    }
}
