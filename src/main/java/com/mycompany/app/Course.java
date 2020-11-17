package com.mycompany.app;

import org.joda.time.*;
import java.util.ArrayList;

public class Course {

    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> student;
    private DateTime start;
    private DateTime end;



    public Course() {
    }

    public Course(String name, ArrayList<Module> modules, ArrayList<Student> student, DateTime start, DateTime end) {
        this.name = name;
        this.modules = modules;
        this.student = student;
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

    public ArrayList<Student> getStudent() {
        return this.student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
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

    public Course name(String name) {
        this.name = name;
        return this;
    }

    public Course modules(ArrayList<Module> modules) {
        this.modules = modules;
        return this;
    }

    public Course student(ArrayList<Student> student) {
        this.student = student;
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
            ", student='" + getStudent() + "'" +
            ", start='" + getStart() + "'" +
            ", end='" + getEnd() + "'" +
            "}";
    }
    

}
