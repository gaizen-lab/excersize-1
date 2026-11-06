import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class FizzBuzzChecker {
    @Test
    void testDivisibleByBoth3And5() {
        List<String> expected = List.of(
                "Divisible by 3",
                "Divisible by 5"
        );

        List<String> actual = FizzBuzz.fizzBuzz(15);

        assertEquals(expected, actual);
    }

    @Test
    void testDivisibleBy3() {
        List<String> expected = List.of("Divisible by 3");

        List<String> actual = FizzBuzz.fizzBuzz(9);

        assertEquals(expected, actual);
    }

    @Test
    void testDivisibleBy5() {
        List<String> expected = List.of("Divisible by 5");
        
        List<String> actual = FizzBuzz.fizzBuzz(10);

        assertEquals(expected, actual);
    }

    @Test
    void testNotDivisibleBy3Or5() {
        List<String> expected =
                List.of("Not divisible by 3 or 5");

        List<String> actual =
                FizzBuzz.fizzBuzz(7);

        assertEquals(expected, actual);
    }
}
