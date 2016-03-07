import java.util.Random;

public class Guess {
    private CompareNumber compareNumber;
    private String answer;


    public Guess(AnswerGenerator answerGenerator, CompareNumber compareNumber) {
        this.answer = answerGenerator.generateAnswer();
        this.compareNumber = compareNumber;
    }

    public String guessNumber(String input) {
        return compareNumber.compare(input, answer);
    }
}
