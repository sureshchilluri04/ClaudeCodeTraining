package com.example.claudecodetraining

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(2, 4 - 2)
    }

    @Test
    fun multiplication_isCorrect() {
        assertEquals(6, 2 * 3)
    }

    @Test
    fun division_isCorrect() {
        assertEquals(2, 4 / 2)
    }

    @Test
    fun division_byZero_throwsArithmeticException() {
        val zero = 0
        assertThrows(ArithmeticException::class.java) {
            4 / zero
        }
    }

    @Test
    fun stringConcatenation_isCorrect() {
        assertEquals("Hello Android!", "Hello " + "Android!")
    }

    @Test
    fun booleanLogic_isCorrect() {
        assertTrue(2 + 2 == 4)
        assertFalse(2 + 2 == 5)
    }
}