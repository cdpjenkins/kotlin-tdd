import org.example.fizzBuzz
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource(
        "1,1",
        "2,2",
        "3,fizz",
        "6,fizz",
        "9,fizz",
        "5,buzz",
        "10,buzz",
        "15,fizzbuzz",
        "30,fizzbuzz")
    fun `fizzbuzz returns correct result`(input: Int, expected: String) {
        assertEquals(expected, fizzBuzz(input))
    }


    @Test
    fun `passing negative number throws IllegalArgumentException`() {
        assertThrows<IllegalArgumentException> { fizzBuzz(-1) }
    }
}
