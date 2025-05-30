import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class HelloKotlinTest {

    @Test
    fun `passing 1 as parameter returns 1`() {
        assertEquals("1", fizzBuzz(1))
    }

    @Test
    fun `passing 2 returns 2`() {
        assertEquals("2", fizzBuzz(2))
    }

    @Test
    fun `passing 3 returns fizz`() {
        assertEquals("fizz", fizzBuzz(3))
    }

    @Test
    fun `passing 5 returns buzz`() {
        assertEquals("buzz", fizzBuzz(5))
    }

    @Test
    fun `passing 10 returns buzz`() {
        assertEquals("buzz", fizzBuzz(10))
    }

    @Test
    fun `passing 6 returns fizz`() {
        assertEquals("fizz", fizzBuzz(6))
    }

    @Test
    fun `passing 9 returns fizz`() {
        assertEquals("fizz", fizzBuzz(9))
    }

    @Test
    fun `passing -1 throws IllegalArgumentException`() {
        assertThrows<IllegalArgumentException> { fizzBuzz(-1) }
    }

    private fun fizzBuzz(i: Int): String {
        if (i == -1) throw IllegalArgumentException("Parameter must be greater than 0")
        if (i % 5 == 0) return "buzz"
        if (i % 3 == 0) return "fizz"
        return i.toString()
    }
}
