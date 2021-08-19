package pro190525;

// while循环：先判断，后执行
// 循环：条件+操作
/*
while(条件){
    操作;
}
当条件为true时，执行操作；当条件为false时，结束循环
 */
public class DemoG1 {
    public static void main(String[] args) {
        // 输出1-10
        int i = 1;
        while(i<11){
            System.out.println(i);
            i++;
        }
        // 求出1-100之和
        i = 1;
        int sum = 0;
        while(i<101){
            sum+=i;// 累加
            i++;// 自增1
            //sum+=i++;// 连起来写也行
        }
        System.out.println(sum);
    }
}
