package study;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator cal;

    @BeforeEach
    void setUp(){
        cal = new Calculator();
    }

    @Test
    void add(){
        assertEquals(7, cal.add(3,4));
    }

    @Test
    void subtract(){
        assertEquals(1, cal.subtract(5, 4));
    }

    @Test
    void multiply(){
        assertEquals(6, cal.multiply(2, 3));
    }

    @Test
    void divide(){
        assertEquals(2, cal.divide(8, 4));
    }

    @Test
    void calculator() {
        String input = "2 + 3 * 4 / 2";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(10, cal.calculator());
    }

}
