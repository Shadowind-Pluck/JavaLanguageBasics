package pro191108;

public class Person implements Comparable<Person> {
    private Integer id;
    private String name;
    private Integer age;

    public Person() {// 无参构造器
    }

    public Person(Integer id, String name, Integer age) {// 全参构造器
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("比较了一次！");
        Person p = (Person) obj;// 强制类型转换
        int id1 = p.getId();
        int id2 = this.getId();
        return id1 == id2;
    }

    @Override
    public int compareTo(Person o) {// 按照年龄排序
        return this.getAge()-o.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
