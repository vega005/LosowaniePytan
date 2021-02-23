package pl.daniel.LosowaniePytan;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionsPool {
    private List<String> questionPool = new ArrayList<>();

    public QuestionsPool(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        this.questionPool = lines;
    }

    public List<String> getQuestionPool() {
        return questionPool;
    }

    String getRandomQuestion() {
        Random random = new Random();
        int id = random.nextInt(this.questionPool.size() - 1);
        return this.questionPool.get(id);
    }
}
