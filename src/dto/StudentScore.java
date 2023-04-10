package dto;

import entity.Score;
import entity.Student;

public class StudentScore {
    private int scoreId;

    private Student student;

    private int subjectId;

    private int point;

    public StudentScore() {
    }
    public StudentScore(Student student, Score score) {
        this.scoreId = score.getId();
        this.subjectId = score.getSubjectId();
        this.point = score.getPoint();
        this.student = student;
    }

    public StudentScore(int scoreId, Student student, int subjectId, int point) {
        this.scoreId = scoreId;
        this.student = student;
        this.subjectId = subjectId;
        this.point = point;
    }

    public int getScoreId() {
        return scoreId;
    }

    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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
