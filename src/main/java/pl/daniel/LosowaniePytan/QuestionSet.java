package pl.daniel.LosowaniePytan;


import java.util.ArrayList;
import java.util.List;

public class QuestionSet {
    private List<Question> list = new ArrayList<>();

    public QuestionSet(pl.daniel.LosowaniePytan.QuestionsPool pool, int limit) {
        while (list.size() < limit) {
            String qText = pool.getRandomQuestion();
            Question question = new Question(qText);
            this.addQuestion(question);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < this.list.size(); i++) {
            String q = this.list.get(i).getText();
            String separator = "<&&>";
            if (i == this.list.size() - 1) {
                separator = "";
            }
            result += q + separator;

        }
        return result;
    }

    private void addQuestion(Question q) {
        if (!this.hasQuestion(q)) {
            this.list.add(q);
        }
    }

    private boolean hasQuestion(Question question) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getText() == question.getText()) {
                return true;
            }
        }
        return false;
    }
}
