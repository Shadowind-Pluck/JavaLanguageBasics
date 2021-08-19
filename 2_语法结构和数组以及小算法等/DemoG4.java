package pro190525;

import java.util.Scanner;

// do-while循环：先执行，后判断
/*
do{
    操作;
}while(条件);
 */
public class DemoG4 {
    public static void main(String[] args) {
        // 输入一个数，判断这个数是否是素数
        // 1不是素数
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int num = sc.nextInt();
        int i = 2;
        boolean b = true;// true：标志为素数
        // do-while循环会有一个bug，2识别错误
        /*do{
            if(num%i==0){
                b = false;
                break;
            }
            i++;
        }while(i<num);*/
        while(i<num){
            if(num%i==0){
                b = false;
                // 一旦b变为false，就立刻确定num不是素数，所以循环可以直接跳出
                break;
            }
            i++;
        }
        if(b){
            System.out.println("是素数");
        }else{
            System.out.println("不是素数");
        }
    }
}
