package pro190630;

// 封装
public class DemoA {
    // 将属性私有化 private：私有的，除了当前类之外其他人都不能访问
    private int id;
    private String name;
    private char sex;
    private int age;

    // 每一个属性提供两个方法
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getSex() {
        return sex;
    }
    public int getAge() {
        return age;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
