package models;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Question implements Serializable {

    private Category category;
    private String text;
    private List<Option> optionList;
    private AttemptState attemptState = AttemptState.NEW;
    private int value;

    public Question() { }

    public Question(Category category, String text, int value) {
        setCategory(category);
        setText(text);
        setValue(value);
    }

    public Question(Category category, String text, int value, List<Option> optionList) {
        setCategory(category);
        setText(text);
        setValue(value);
        setOptionList(optionList);
    }

    public Question(Category category, String text, int value, Option... options) {
        this(category, text, value, Arrays.asList(options));
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }

    public AttemptState getAttemptState() {
        return attemptState;
    }

    public void setAttemptState(AttemptState attemptState) {
        this.attemptState = attemptState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question = (Question) o;
        return getValue() == question.getValue() &&
            Objects.equals(getCategory(), question.getCategory()) &&
            Objects.equals(getText(), question.getText()) &&
            Objects.equals(getOptionList(), question.getOptionList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCategory().getName(), getText(), getOptionList(), getValue());
    }
}
