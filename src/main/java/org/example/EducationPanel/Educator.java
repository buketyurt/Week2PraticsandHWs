package org.example.EducationPanel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Educator {
    private List<Content> contents;

    public Educator() {
        this.contents = new ArrayList<>();
    }

    public void addContent(Content content) {
        contents.add(content);
    }

    public void editContent(Content content, String newTitle, String newDescription, String newYoutubeLink,
                            String[] newQuizQuestion, String newLesson) {
        content.setTitle(newTitle);
        content.setDescription(newDescription);
        content.setLink(newYoutubeLink);
        content.setQuizQuestion(Arrays.toString(newQuizQuestion));
        content.setLesson(newLesson);
    }

    public void deleteContent(Content content) {
        contents.remove(content);
    }

    public List<Content> listContentsByCourse(String courseName) {
        return contents.stream()
                .filter(content -> content.getLesson().equals(courseName))
                .collect(Collectors.toList());
    }

    public List<Content> listContentsByTitle(String title) {
        return contents.stream()
                .filter(content -> content.getTitle().contains(title))
                .collect(Collectors.toList());
    }

}
