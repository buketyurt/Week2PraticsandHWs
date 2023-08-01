package org.example.EducationPanel;

import java.util.ArrayList;
import java.util.List;

public class RegistrationScreen {
    private List<Student> students;

    public RegistrationScreen() {
        this.students = new ArrayList<>();
    }

    public void registerStudent(String username, String password) {
        Student newStudent = new Student();
        newStudent.setUsername(username);
        newStudent.setPassword(password);
        students.add(newStudent);
    }
}
