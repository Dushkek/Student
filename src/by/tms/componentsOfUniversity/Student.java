package by.tms.componentsOfUniversity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends by.tms.componentsOfUniversity.Faculty {
    public static final List<Student> students = new ArrayList<>();

    private String name;
    private int course;
    private int id;


    private static int nextId = 0;


    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void setId(){
        id = nextId;
        nextId++;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, nameOfFac);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                id == student.id &&
                Objects.equals(name, student.name);
    }

    public int getId() {
        return id;
    }
    public static int getNextId() {
        return nextId;
    }
}
