import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    void shouldReturnIfStringEmpty() {
        //given
        var calculator = new StringCalculator();

        //when
        var result = calculator.add("");

        //then
        assertEquals(0, result);
    }

    @Test
    void shouldReturnIfStringFour(){
        //given
        var calculator = new StringCalculator();

        //when
        var result = calculator.add("4");

        //then
        assertEquals(4,result);
    }
}