package pro190525;
/*
输出：
* * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * *
 */
public class DemoG2 {
    public static void main(String[] args) {
        // 方法一
        int i = 0;
        while(i<3){
            int j = 0;
            while(j<20){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        // 方法二
        i = 0;
        while(i<60){
            // 当把判断换行语句if放在这里时，输出正确但是开始时会多输出一个换行
            System.out.print("* ");
            // 当把判断换行语句if放在这里时，输出不正确
            i++;
            // 此处为最佳位置
            // 循环语句执行结束前确实都会执行一条换行语句，但是还得多写一次，达到空一行的作用
            if(i%20==0){
                System.out.println();
            }
        }
        System.out.println();
        // 方法二附属
        i = 1;
        while(i<61){
            System.out.print("* ");
            if(i%20==0){
                System.out.println();
            }
            i++;
        }
    }
}
