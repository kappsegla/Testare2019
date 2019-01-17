package oop;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private Teacher teacher;
    private Adress adress;
    private int hours;
    private int students;
    private ArrayList<Student> studentsList;

    public Course(String courseName, Teacher teacher, Adress adress, int hours, int students) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.adress = adress;
        this.hours = hours;
        this.students = students;
        studentsList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentsList.add(student);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        String s = courseName + "\n" + teacher + "\n" + adress + "\n";

        StringBuilder stringBuilder = new StringBuilder();

        int size = studentsList.size();

        for (int i = 0; i < size; i++) {
            stringBuilder.append(studentsList.get(i) + "\n");
        }

        return s + stringBuilder.toString();
    }
}
