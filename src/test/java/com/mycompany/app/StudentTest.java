package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.joda.time.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StudentTest {

    DateTime studentDob = new DateTime(2020, 01, 02, 20, 12);
    String studentName = "Jack Lynch";
    int studentAge = 22;
    int studentID = 17370591;
    String studentUsername = "jlynch25";

    DateTime courseStart = new DateTime(2020, 01, 02, 20, 12);
    DateTime courseEnd = new DateTime(2020, 12, 30, 20, 12);

    Course course = new Course("CSIT", courseStart, courseEnd);
    Module module = new Module("Software Enginering III", "CT417");

    Student student = new Student(studentName, studentAge, studentDob, studentID, studentUsername);

    /**
     * Rigorous Test :-)
     */

    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals(studentName, student.getName());
        assertEquals(studentDob, student.getDob());
        assertEquals(studentAge, student.getAge());
        assertEquals(studentID, student.getId());
        assertEquals(studentUsername, student.getUsername());
    
        assertFalse(student.getCourses().contains(course));
    
        student.addCourse(course);

        assertTrue(student.getCourses().contains(course));

        assertEquals(0, student.getModules().size());
        assertFalse(student.getModules().contains(module));

        student.addModule(module);

        assertTrue(student.getModules().contains(module));

        assertEquals(1, student.getModules().size());
    }

   
}
