package com.mycompany.app;

import org.joda.time.*;
import java.util.ArrayList;

public class Course {

    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime start;
    private DateTime end;



    public Course() {
    }

    public Course(String name,  DateTime start, DateTime end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Module> getModules() {
        return this.modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void setStudents(ArrayList<Student> student) {
        this.students = student;
    }

    public DateTime getStart() {
        return this.start;
    }

    public void setStart(DateTime start) {
        this.start = start;
    }

    public DateTime getEnd() {
        return this.end;
    }

    public void setEnd(DateTime end) {
        this.end = end;
    }

    public void addModule(Module module) {
        this.modules.add(module);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public Course name(String name) {
        this.name = name;
        return this;
    }

    public Course modules(ArrayList<Module> modules) {
        this.modules = modules;
        return this;
    }

    public Course students(ArrayList<Student> students) {
        this.students = students;
        return this;
    }

    public Course start(DateTime start) {
        this.start = start;
        return this;
    }

    public Course end(DateTime end) {
        this.end = end;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", modules='" + getModules() + "'" +
            ", student='" + getStudents() + "'" +
            ", start='" + getStart() + "'" +
            ", end='" + getEnd() + "'" +
            "}";
    }
    

}
