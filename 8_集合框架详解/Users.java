package pro191108;

public class Users implements Comparable<Users> {
    private Integer userId;
    private String userName;
    private Integer userAge;

    public Users(Integer userId, String userName, Integer userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
    }

    public Users() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public boolean equals(Object obj) {
        // 注意运算符优先级，强制类型转换时，需要两层括号
        return this.getUserAge() == ((Users)obj).getUserAge();
    }

    @Override
    public int compareTo(Users o) {
        return this.getUserId() - o.getUserId();
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
