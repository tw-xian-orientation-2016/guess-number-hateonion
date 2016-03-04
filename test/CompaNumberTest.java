import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CompaNumberTest{

    @Test
    public void should_return_4A0B() {
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare("1234", "1234");
        assertThat(result, is("4A0B"));
    }

}