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
    public void should_return_4A0B_when_all_match() {
        String result = compareNumber.compare("1234", "1234");
        assertThat(result, is("4A0B"));
    }

    @Test
    public void should_return_0A4B_when_all_include_but_not_match() {
        String result = compareNumber.compare("4321", "1234");
        assertThat(result, is("0A4B"));
    }

    @Test
    public void should_return_0A0B_when_neither_match_nor_include() {
        String result = compareNumber.compare("7890", "1234");
        assertThat(result, is("0A0B"));
    }
}