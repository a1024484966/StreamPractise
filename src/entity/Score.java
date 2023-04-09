package entity;

public class Score {
    private int id;

    private int studentId;

    private int subjectId;

    private int point;

    public Score() {
    }

    public Score(int id, int studentId, int subjectId, int point) {
        this.id = id;
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
