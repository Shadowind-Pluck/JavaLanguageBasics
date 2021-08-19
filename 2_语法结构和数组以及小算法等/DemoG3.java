package pro190525;
/*
输出：
*
* *
* * *
* * * *
* * * * *
 */
public class DemoG3 {
    public static void main(String[] args) {
        // 方法一
        int i = 1,j = 1;
        while(i<6){
            // 其实这里非常简单，加一句 int j = 1; 就可以了，只是为了后面的方法可以不用定义 j 而这样书写
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            j = 1;
            i++;
        }
        System.out.println();
        // 奇怪的方法二（有改善前景）
        i = 1;
        j = 1;
        while(i<5){
            System.out.print("* ");
            if(i==j){
                System.out.println();
                j++;
                i = 0;
            }
            i++;
        }
        System.out.println("* ");
        System.out.println();
        // 方法三
        i = 1;
        j = 1;
        int count = 1;
        while(i<16){
            System.out.print("* ");
            if(j==count){
                System.out.println();
                j = 1;
                count++;
            }else{
                j++;
            }
            i++;
        }
    }
}
