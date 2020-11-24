package com.mycompany.app;

import org.joda.time.*;
import java.util.ArrayList;

// import org.joda.time;

public class Student {
    
    private String name;
    private int age;
    private DateTime dob;
    private int id;
    private String username;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Module> modules = new ArrayList<Module>();


    public Student() {
    }

    public Student(String name, int age, DateTime dob, int id, String username) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = username;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDob() {
        return this.dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return this.modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }
    
    public void addModule(Module module) {
        this.modules.add(module);
    }

    public Student name(String name) {
        this.name = name;
        return this;
    }

    public Student age(int age) {
        this.age = age;
        return this;
    }

    public Student dob(DateTime dob) {
        this.dob = dob;
        return this;
    }

    public Student id(int id) {
        this.id = id;
        return this;
    }

    public Student username(String username) {
        this.username = username;
        return this;
    }

    public Student courses(ArrayList<Course> courses) {
        this.courses = courses;
        return this;
    }

    public Student modules(ArrayList<Module> modules) {
        this.modules = modules;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", dob='" + getDob() + "'" +
            ", id='" + getId() + "'" +
            ", username='" + getUsername() + "'" +
            ", courses='" + getCourses() + "'" +
            ", modules='" + getModules() + "'" +
            "}";
    }
    

}

