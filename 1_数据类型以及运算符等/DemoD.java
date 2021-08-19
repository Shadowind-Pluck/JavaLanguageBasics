package pro190519;
// 自增自减运算符
public class DemoD {
    /*
    i++ ++i
    i-- --i
     */
    public static void main(String[] args) {
        int i = 1;
        //i++;// i = i+1;先用后加（同理i--）
        //++i;// i = i+1;先加后用（同理--i）
        System.out.println(++i+(++i)+i+i++);
        System.out.println(i);
        ++i;
        System.out.println(i);
    }
}
