package pro190525;
// 循环跳出操作——continue
public class DemoG9 {
    public static void main(String[] args) {
        for(int i = 1;i<11;i++){
            if(i==5){
                // 注意：java中continue必须书写在代码块的最后一行，c语言中不要求
                continue;// 结束当次循环，开启下一个循环
            }
            System.out.println("跑第"+i+"圈");
        }
    }
}
