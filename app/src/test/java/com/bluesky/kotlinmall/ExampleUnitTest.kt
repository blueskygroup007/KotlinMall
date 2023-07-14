package com.bluesky.kotlinmall

import com.bluesky.kotlinmall.ui.activity.isValidPhoneNumber
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
    fun testIsValidPhoneNumber() {
        // 测试有效的电话号码
        assertTrue(isValidPhoneNumber("1234567890"))
        assertTrue(isValidPhoneNumber("9876543210"))

        // 测试无效的电话号码
        assertFalse(isValidPhoneNumber("12345678901"))
        assertFalse(isValidPhoneNumber("98765432101"))
    }


}