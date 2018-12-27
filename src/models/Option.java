package models;

import java.util.Objects;

public class Option {

    private String text;
    private boolean isCorrect;

    public Option() { }

    public Option(String text) {
        this(text, false);
    }

    public Option(String text, boolean isCorrect) {
        setText(text);
        setCorrect(isCorrect);
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Option)) return false;
        Option option = (Option) o;
        return isCorrect() == option.isCorrect() &&
            Objects.equals(getText(), option.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getText(), isCorrect());
    }
}
