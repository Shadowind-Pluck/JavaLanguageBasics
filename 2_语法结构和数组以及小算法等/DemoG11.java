package pro190525;
// 给循环起名字，可以对特定循环进行操作
public class DemoG11 {
    public static void main(String[] args) {
        a:for(int i = 0;i<10;i++){
            b:for(int j = 0;j<10;j++){
                if(j==4){
                    // break和continue都适用
                    break a;
                }
                System.out.println("内");
            }
            System.out.println("外");
        }
    }
}
