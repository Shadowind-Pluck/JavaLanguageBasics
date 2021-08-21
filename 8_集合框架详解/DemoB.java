package pro191108;
// 泛型
public class DemoB<T> {
    // 这样写有缺点，不论怎样都只能得到Object类型的数据，不够灵活
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 注意：如果不指定类型，默认为Object类型
        DemoB<Integer> db = new DemoB<>();
        db.setT(1);
        int i = db.getT();
        System.out.println(i);
    }
}
