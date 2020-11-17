package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.joda.time.*;

import org.junit.Test;



public class CourseTest {

    String courseName = "CSIT";
    DateTime courseStart = new DateTime(2020, 01, 02, 20, 12);
    DateTime courseEnd = new DateTime(2020, 12, 30, 20, 12);

    Course course = new Course("CSIT", courseStart, courseEnd);

    Module module = new Module("Software Enginering III", "CT417");

    DateTime studentDob = new DateTime(2020, 01, 02, 20, 12);
    String studentName = "Jack Lynch";
    int studentAge = 22;
    int studentID = 17370591;
    String studentUsername = "jlynch25";
    Student student = new Student(studentName, studentAge, studentDob, studentID, studentUsername);

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals(courseName, course.getName());
        assertEquals(courseStart, course.getStart());
        assertEquals(courseEnd, course.getEnd());

        // assertFalse(course.getStudents().contains(student));

        // course.addStudent(student);

        // assertTrue(course.getStudents().contains(student));

        // assertEquals(0, course.getModules().size());
        // assertFalse(course.getModules().contains(module));

        // course.addModule(module);

        // assertTrue(course.getModules().contains(module));

        // assertEquals(1, course.getModules().size());
    }
    
}
