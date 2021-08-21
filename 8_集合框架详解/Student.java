package pro191108;

public class Student implements Comparable<Student>{
    private Integer stuId;
    private String stuName;
    private Integer stuAge;

    public Student() {
    }

    public Student(Integer stuId, String stuName, Integer stuAge) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.getStuId() == s.getStuId();
    }

    @Override
    public int compareTo(Student o) {
        return this.getStuAge() - o.getStuAge();
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}
