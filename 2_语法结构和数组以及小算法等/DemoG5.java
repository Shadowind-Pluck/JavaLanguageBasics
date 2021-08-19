package pro190525;

public class DemoG5 {
    // 1-100之间的素数和
    // 1不是素数
    // 1-100之间的素数和为1060
    public static void main(String[] args) {
        int sum = 0,j = 2;
        while(j<101){
            boolean b = true;
            /*
            注意：双重循环最容易遇到的问题，内部循环结束后需要重置计数变量
            为书写简洁方便，可以把内部循环的计数变量定义在外部循环内且内部循环外并初始化，一举两得，不用在主函数中定义
             */
            int i = 2;
            while(i<j){
                if(j%i==0){
                    b = false;
                    break;
                }
                i++;
            }
            if(b){
                sum+=j;
            }
            j++;
        }
        System.out.println(sum);
    }
}
