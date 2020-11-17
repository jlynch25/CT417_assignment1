package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.joda.time.*;

import org.junit.Test;

public class ModuleTest {
    String moduleName = "Software Enginering III";
    String moduleID = "CT417";

    DateTime courseStart = new DateTime(2020, 01, 02, 20, 12);
    DateTime courseEnd = new DateTime(2020, 12, 30, 20, 12);

    Course course = new Course("CSIT", courseStart, courseEnd);

    Module module = new Module(moduleName, moduleID);

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
        assertEquals(moduleName, module.getName());
        assertEquals(moduleID, module.getId());

        // assertFalse(module.getStudents().contains(student));

        // module.addStudent(student);

        // assertTrue(module.getStudents().contains(student));

        // assertEquals(0, module.getCourses().size());
        // assertFalse(module.getCourses().contains(course));

        // module.addCourse(course);

        // assertTrue(module.getCourses().contains(course));

        // assertEquals(1, module.getCourses().size());
    }
}
