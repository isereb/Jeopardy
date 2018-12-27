package models;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Category {

    private String name;
    private List<Question> questionList;

    public Category() {
    }

    public Category(String name, List<Question> questionList) {
        setName(name);
        setQuestionList(questionList);
    }

    public Category(String name, Question... questions) {
        setName(name);
        setQuestionList(Arrays.asList(questions));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;
        Category category = (Category) o;
        return Objects.equals(getName(), category.getName()) &&
            Objects.equals(getQuestionList(), category.getQuestionList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getQuestionList());
    }

    @Override
    public String toString() {
        return name;
    }
}
