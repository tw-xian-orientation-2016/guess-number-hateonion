import java.util.Random;

public class AnswerGenerator {
    private Random random;

    public AnswerGenerator(Random random) {
        this.random = random;
    }

    public String generateAnswer() {

        String answer = "";
        String current;

        while(answer.length() != 4) {
            current = String.valueOf(random.nextInt(10));
            if(answer.indexOf(current) == -1) {
                answer += current;
            }
        }

        return answer;
    }
}
