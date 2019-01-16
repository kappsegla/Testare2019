package oop;

public class Course {

    private String courseName;
    private Teacher teacher;
    private Adress adress;
    private int hours;
    private int students;

    public Course(String courseName, Teacher teacher, Adress adress, int hours, int students) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.adress = adress;
        this.hours = hours;
        this.students = students;
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
        return courseName + "\n" + teacher + "\n" + adress;
    }
}
