package pro190525;

import java.util.Scanner;

// if-else结构
/*
if(条件){
    操作1;
}else{
    操作2;
}
 */
public class DemoB {// 代表类的开始
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int score = sc.nextInt();
        if(score>=80){
            System.out.println("很好，奖励！");
        }else{
            System.out.println("不行，处罚！");
        }
    }
}// 代表类的结束
