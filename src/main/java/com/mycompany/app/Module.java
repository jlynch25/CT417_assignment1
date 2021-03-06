package com.mycompany.app;

import java.util.ArrayList;

public class Module {
    
    private String name;
    private String id; 
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();


    public Module() {
    }

    public Module(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }
    
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public Module name(String name) {
        this.name = name;
        return this;
    }

    public Module id(String id) {
        this.id = id;
        return this;
    }

    public Module students(ArrayList<Student> students) {
        this.students = students;
        return this;
    }

    public Module courses(ArrayList<Course> courses) {
        this.courses = courses;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", id='" + getId() + "'" +
            ", students='" + getStudents() + "'" +
            ", courses='" + getCourses() + "'" +
            "}";
    }

}
