package pl.daniel.LosowaniePytan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Controller {

    @GetMapping("/getQuestion")
    public String getQuestion() throws IOException {

        QuestionsPool questions = new QuestionsPool("C:\\Users\\vega0\\OneDrive\\Pulpit\\LosowaniePytan\\src\\main\\java\\pl\\daniel\\LosowaniePytan\\pytania.txt");

        QuestionSet questionSet = new QuestionSet(questions, 5);

        return questionSet.toString();
    }
}
