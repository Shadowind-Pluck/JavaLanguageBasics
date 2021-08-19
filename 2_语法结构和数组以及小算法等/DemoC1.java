package pro190525;

public class DemoC1 {
    // 快捷注释：点击Ctrl+/，若要取消注释，再点击一次
    // 快捷添加多行注释：选中内容，点击Ctrl+Shift+/，若要取消注释，再点击一次
    public static void main(String[] args) {
        // 有三个随机数，请对这三个数进行排序操作（从小到大输出显示）
        int a = (int)(Math.random()*100+1);
        int b = (int)(Math.random()*100+1);
        int c = (int)(Math.random()*100+1);
        /*
        注意：当输出时想要使用转义字符修改格式，应当使用双引号括住转义字符，然后再用+连接
                单引号里的转义字符用+连接时会被识别为数值类型
         */
        if(a<b){
            if(a<c){
                if(b<c){
                    System.out.println(a+"\t"+b+"\t"+c);
                }else{
                    System.out.println(a+"\t"+c+"\t"+b);
                }
            }else{
                System.out.println(c+"\t"+a+"\t"+b);
            }
        }else{
            if(b<c){
                if(a<c){
                    System.out.println(b+"\t"+a+"\t"+c);
                }else{
                    System.out.println(b+"\t"+c+"\t"+a);
                }
            }else{
                System.out.println(c+"\t"+b+"\t"+a);
            }
        }
    }
}
