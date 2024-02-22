package training.maven.quick;

import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {
    private final HolaMundo sut = new HolaMundo();

    @Test
    public void addition_should_add_two_numbers() {
        assertEquals(4, sut.addition(2, 2));
    }

    @Test
    public void subtraction_should_subtract_second_number_from_first_number() {
        assertEquals(6, sut.subtraction(8, 2));
    }

    @Test
    public void multiplication_should_multiply_two_numbers() {
        assertEquals(32, sut.multiplication(8, 4));
    }

    @Test
    public void division_should_divide_first_number_with_the_second() {
        assertEquals(5,sut.division(40, 8));
    }
}
