import com.sun.tools.javac.api.ClientCodeWrapper;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnswerGeneratorTest {

    @Test
    public void should_return_correct_string() {
        Random mockedRandom = mock(Random.class);

        when(mockedRandom.nextInt(10)).thenReturn(1, 2, 3, 4);

        AnswerGenerator answerGenerator = new AnswerGenerator(mockedRandom);
        String answer = answerGenerator.generateAnswer();

        assertThat(answer, is("1234"));
    }

    @Test
    public void should_return_no_repeat_correct_string() {
        Random mockedRandom = mock(Random.class);

        when(mockedRandom.nextInt(10)).thenReturn(2,2,3,4,5);

        AnswerGenerator answerGenerator = new AnswerGenerator(mockedRandom);
        String answer = answerGenerator.generateAnswer();

        assertThat(answer, is("2345"));
    }
}