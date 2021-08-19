package pro190525;

import java.util.Scanner;

public class DemoF {
    // 输入一个代表年月日的八位整数，求出上一天和下一天
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个代表年月日的八位整数：");
        int date = sc.nextInt();
        int year = date/10000;
        //int month = date/100%100;
        int month = date%10000/100;
        int day = date%100;
        // 用多重if分支语句书写，太过于复杂，考虑情况过多，浪费时间
        // 举例：一月，注意二月，得判断是否为闰年
        if(month==1){
            if(day==1){
                System.out.println("上一天："+(year-1)+"年12月31日");
                System.out.println("下一天："+year+"年"+month+"月"+(day+1)+"日");
            }else if(day==31){
                System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天："+year+"年"+(month+1)+"月1日");
            }else{
                System.out.println("上一天："+year+"年"+month+"月"+(day-1)+"日");
                System.out.println("下一天："+year+"年"+month+"月"+(day+1)+"日");
            }
        }
    }
}
