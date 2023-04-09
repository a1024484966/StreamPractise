package entity;

public class Teacher {
    private int id;
    private String name;
    int age;
    private int subjectId;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, int subjectId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subjectId = subjectId;
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

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }
}
