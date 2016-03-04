import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.portable.Streamable;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CompaNumberTest{
    private CompareNumber compareNumber;
    @Before
    public void init() {
        compareNumber = new CompareNumber();
    }


    @Test
    public void should_return_4A0B() {
        String result = compareNumber.compare("1234", "1234");
        assertThat(result, is("4A0B"));
    }

    @Test
    public void should_return_0A4B() {
        String result = compareNumber.compare("4321", "1234");
        assertThat(result, is("0A4B"));
    }

    @Test
    public void should_return_0A0B() {
        String result = compareNumber.compare("5678", "1234");
        assertThat(result, is("0A0B"));
    }


}