package org.example.EducationPanel;

import java.util.ArrayList;
import java.util.List;

public class LoginScreen {
    private List<Operator> operators;
    private List<Student> students;

    public LoginScreen() {
        this.operators = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addOperator(Operator operator) {
        operators.add(operator);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean validateOperator(String username, String password) {
        for (Operator operator : operators) {
            if (operator.getUsername().equals(username) && operator.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean validateStudent(String username, String password) {
        for (Student student : students) {
            if (student.getUsername().equals(username) && student.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
