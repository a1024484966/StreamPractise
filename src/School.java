import entity.*;

import java.util.*;
import java.util.stream.Collectors;

public class School {
    public List<Student> students = new ArrayList<>();
    public List<Score> scores = new ArrayList<>();
    public List<Classroom> classrooms = new ArrayList<>();
    public List<Subject> subjects = new ArrayList<>();
    public List<Teacher> teachers = new ArrayList<>();
    public School() {
        indexData();
    }
    public School(String name) {
        System.out.println(name);
    }
    public void practise(){
        //根据sex这一个条件分组
        Map<String, List<Student>> collect = students.stream().collect(Collectors.groupingBy(obj -> obj.getSex()));
        collect.forEach((k,v) -> System.out.print(k + v.toString()));
        System.out.println("\n--------------------------------------------");
        //分组后统计总和
        Map<String, Long> collect1 = students.stream().collect(Collectors.groupingBy(obj -> obj.getSex(), Collectors.counting()));
        collect1.forEach((k,v) -> System.out.print(k+v));
        System.out.println("\n--------------------------------------------");


    }

    public void indexData(String s){
        System.out.println(s);
    }
    public void indexData(){
        students.add(new Student(1,"小明1",10,"男",1));
        students.add(new Student(2,"小明2",11,"女",1));
        students.add(new Student(3,"小明3",12,"男",1));
        students.add(new Student(4,"小明4",10,"女",1));
        students.add(new Student(5,"小明5",11,"男",1));
        students.add(new Student(6,"小明6",12,"男",1));
        students.add(new Student(7,"小明7",13,"女",1));
        students.add(new Student(8,"小明8",11,"女",1));
        students.add(new Student(9,"小明9",11,"男",1));
        students.add(new Student(10,"小明10",10,"女",1));
        students.add(new Student(11,"小明11",11,"不明",1));
        students.add(new Student(12,"小明12",11,"男",1));

        students.add(new Student(13,"小红1",12,"男",2));
        students.add(new Student(14,"小红2",14,"女",2));
        students.add(new Student(15,"小红3",14,"男",2));
        students.add(new Student(16,"小红4",15,"女",2));
        students.add(new Student(17,"小红5",13,"男",2));
        students.add(new Student(18,"小红6",13,"男",2));
        students.add(new Student(19,"小红7",13,"男",2));
        students.add(new Student(20,"小红8",12,"女",2));
        students.add(new Student(21,"小红9",12,"男",2));
        students.add(new Student(22,"小红10",11,"男",2));
        students.add(new Student(23,"小红11",13,"女",2));
        students.add(new Student(24,"小红12",13,"男",2));
        students.add(new Student(25,"小红13",14,"不明",2));
        students.add(new Student(26,"小红14",14,"男",2));

        classrooms.add(new Classroom(1,"一班",1));
        classrooms.add(new Classroom(2,"二班",2));

        subjects.add(new Subject(1,"语文"));
        subjects.add(new Subject(2,"数学"));

        teachers.add(new Teacher(1,"小华1",35,1));
        teachers.add(new Teacher(2,"小华2",32,2));
        teachers.add(new Teacher(3,"小华3",36,1));
        teachers.add(new Teacher(4,"小华4",45,2));

        scores.add(new Score(1,1,1,68));
        scores.add(new Score(2,1,2,72));
        scores.add(new Score(3,2,1,77));
        scores.add(new Score(4,2,2,76));
        scores.add(new Score(5,3,1,85));
        scores.add(new Score(6,3,2,83));
        scores.add(new Score(7,4,1,78));
        scores.add(new Score(8,4,2,92));
        scores.add(new Score(9,5,1,61));
        scores.add(new Score(10,5,2,42));
        scores.add(new Score(11,6,1,55));
        scores.add(new Score(12,6,2,34));
        scores.add(new Score(13,7,1,100));
        scores.add(new Score(14,7,2,100));
        scores.add(new Score(15,8,1,92));
        scores.add(new Score(16,8,2,55));
        scores.add(new Score(17,9,1,73));
        scores.add(new Score(18,9,2,44));
        scores.add(new Score(19,10,1,80));
        scores.add(new Score(20,10,2,80));
        scores.add(new Score(21,11,1,86));
        scores.add(new Score(22,11,2,74));
        scores.add(new Score(23,12,1,66));
        scores.add(new Score(24,12,2,77));

        scores.add(new Score(25,13,1,68));
        scores.add(new Score(26,13,2,72));
        scores.add(new Score(27,14,1,75));
        scores.add(new Score(28,14,2,76));
        scores.add(new Score(29,15,1,79));
        scores.add(new Score(30,15,2,85));
        scores.add(new Score(31,16,1,78));
        scores.add(new Score(32,16,2,92));
        scores.add(new Score(33,17,1,67));
        scores.add(new Score(34,17,2,42));
        scores.add(new Score(35,18,1,55));
        scores.add(new Score(36,18,2,34));
        scores.add(new Score(37,19,1,67));
        scores.add(new Score(38,19,2,100));
        scores.add(new Score(39,20,1,92));
        scores.add(new Score(40,20,2,55));
        scores.add(new Score(41,21,1,73));
        scores.add(new Score(42,21,2,44));
        scores.add(new Score(43,22,1,80));
        scores.add(new Score(44,22,2,80));
        scores.add(new Score(45,23,1,86));
        scores.add(new Score(46,23,2,100));
        scores.add(new Score(47,24,1,66));
        scores.add(new Score(48,24,2,77));
        scores.add(new Score(49,25,1,66));
        scores.add(new Score(50,25,2,56));
        scores.add(new Score(41,26,1,66));
        scores.add(new Score(52,26,2,79));
    }
}
