package pro191108;

import java.util.Arrays;

public class DemoC implements Comparable<DemoC> {
    private Integer num;

    public DemoC(Integer num) {
        this.num = num;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public int compareTo(DemoC o) {
        int myNum = this.getNum();
        int otherNum = o.getNum();
        System.out.println("开始进行比较，比较原则是num的大小!\tthis:"+myNum+",otherNum:"+otherNum);
        int result = myNum - otherNum;
        return result;
    }

    @Override
    public String toString() {
        return "DemoC{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        DemoC dc1 = new DemoC(12);
        DemoC dc2 = new DemoC(16);
        DemoC dc3 = new DemoC(7);
        DemoC[] array = {dc1,dc2,dc3};
        int result = dc1.compareTo(dc2);
        System.out.println(result);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
