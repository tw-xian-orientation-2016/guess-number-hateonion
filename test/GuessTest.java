import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {

    @Test
    public void should_return_2A2B() {

        AnswerGenerator mockedAnswerGenerator = mock(AnswerGenerator.class);
        when(mockedAnswerGenerator.generateAnswer()).thenReturn("1234");

        CompareNumber mockedCompareNumber = mock(CompareNumber.class);
        when(mockedCompareNumber.compare("3214", "1234")).thenReturn("2A2B");

        Guess guess = new Guess(mockedAnswerGenerator, mockedCompareNumber);

        String result = guess.guessNumber("3214");
        assertThat(result, is("2A2B"));
    }
}