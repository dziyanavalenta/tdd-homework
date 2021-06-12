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
    void shouldReturnIfStringFour() {
        //given
        var calculator = new StringCalculator();

        //when
        var result = calculator.add("4");

        //then
        assertEquals(4, result);
    }

    @Test
    void shouldReturnIfStringSum() {
        //given
        var calculator = new StringCalculator();

        //when
        var result = calculator.add("1,2");

        //then
        assertEquals(3, result);
    }

    //Homework
    @Test
    void shouldReturnIfNewLine() {
        //given
        var calculator = new StringCalculator();

        //when
        var result = calculator.add("1\n2,3");

        //then
        assertEquals(6, result);
    }
}
