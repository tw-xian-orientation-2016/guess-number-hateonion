import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessIntegrationTest {

    private Guess guess;

    @Before
    public void init() {

        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1, 2, 3, 4);
        AnswerGenerator answerGenerator = new AnswerGenerator(random);
        CompareNumber compareNumber = new CompareNumber();
        guess = new Guess(answerGenerator, compareNumber);

    }

    @Test
    public void should_return_4A0B() {

        String result = guess.guessNumber("1234");

        assertThat(result, is("4A0B"));

    }

    @Test
    public void should_return_0A4B() {

        String result = guess.guessNumber("4321");

        assertThat(result, is("0A4B"));

    }


    @Test
    public void should_return_0A0B() {

        String result = guess.guessNumber("5678");

        assertThat(result, is("0A0B"));

    }
}