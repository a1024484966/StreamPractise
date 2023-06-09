package entity;

public class Student {
    private int id;
    private String name;
    private int age;
    private String sex;
    private int classroomId;

    public Student() {
    }

    public Student(int id, String name, int age, String sex, int classroomId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.classroomId = classroomId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }
}
