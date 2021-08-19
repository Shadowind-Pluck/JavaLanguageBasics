package pro190525;

// for循环：其实就是while循环
/*
for(初始化;条件;改变){
    操作;
}
 */
/*
特别注意：Java中使用for循环时注意，如果将计数变量定义在for的初始化中，则其变量为局部变量，不可以在循环外使用
具体情况取决于编译器：当书写c语言时，使用vc6，是全局变量；使用dev，是局部变量
 */
public class DemoG6 {
    public static void main(String[] args) {
        // 输出1-100的偶数和
        int sum = 0;
        for(int i = 1;i<101;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("偶数和："+sum);
    }
}
