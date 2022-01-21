package src.demo2;

public class Student {
    private String sid;
    private String address;
    private String name;
    private String age;

    public Student() {
    }

    public Student(String name, String age, String sid, String address) {
        this.name = name;
        this.age = age;
        this.sid = sid;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSid() {
        return sid;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }
}
