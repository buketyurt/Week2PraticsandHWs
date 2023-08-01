package org.example.EducationPanel;

import java.util.ArrayList;
import java.util.List;

public class StudentPanel {
    private List<Lesson> lessons;
    private List<String> enrolledLessons;

    public StudentPanel() {
        this.lessons = new ArrayList<>();
        this.enrolledLessons = new ArrayList<>();
    }

    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
    }

    public void enrollLesson(String lessonName) {
        enrolledLessons.add(lessonName);
    }

    public Lesson getLessonByName(String lessonName) {
        for (Lesson lesson : lessons) {
            if (lesson.getName().equals(lessonName)) {
                return lesson;
            }
        }
        return null;
    }

}
