package pro190525;// 声明当前类所隶属的文件夹（包）

import java.util.Scanner;

public class DemoA {
    // if结构
    // 注意：Java中if的条件只能是布尔类型
    /*
    if(条件){
        操作;
    }
     */
    public static void main(String[] args) {
        // 产生一个随机数，如果随机数是偶数，则输出一段内容
        int num = (int)(Math.random()*100+1);
        if(num%2==0){
            System.out.println(num+"是一个偶数！");
        }
        // 小明参加考试，如果成绩大于等于80分，奖励。成绩通过用户输入方式
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int score = sc.nextInt();
        if(score>=80){
            System.out.println("奖励");
        }
        System.out.println("代码结束");
    }
}
