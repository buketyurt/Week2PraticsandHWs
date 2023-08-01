package org.example.EducationPanel;

public class Content {
    private String Title;
    private String Description;
    private String Link;
    private String[] QuizQuestion;
    private String Lesson;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public String[] getQuizQuestion() {
        return QuizQuestion;
    }

    public void setQuizQuestion(String quizQuestion) {
        QuizQuestion = new String[]{quizQuestion};
    }

    public String getLesson() {
        return Lesson;
    }

    public void setLesson(String lesson) {
        Lesson = lesson;
    }

    public void filter(String lesson, String Title){}
}
