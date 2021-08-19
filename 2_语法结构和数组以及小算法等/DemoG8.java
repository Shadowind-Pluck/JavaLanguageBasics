package pro190525;
// 循环结束操作——break
public class DemoG8 {
    public static void main(String[] args) {
        for(int i = 1;i<11;i++){
            if(i==5){
                // 注意：Java中break必须书写在代码块的最后一行，c语言中不要求
                break;// 终止循环
            }
            System.out.println("跑第"+i+"圈");
        }
    }
}
