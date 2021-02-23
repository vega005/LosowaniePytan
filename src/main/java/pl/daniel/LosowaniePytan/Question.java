package pl.daniel.LosowaniePytan;

public class Question {
    private String text;
    private Boolean accepted;

    public Question(String text) {
        this.text = text;
        this.accepted = true;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Question{" +
                "text='" + text + '\'' +
                ", accepted=" + accepted +
                '}';
    }

    void reject() {
        this.accepted = false;
    }
}
