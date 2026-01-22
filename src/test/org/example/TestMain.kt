package org.example

import org.junit.Assert.assertEquals
import org.junit.Test

class TestMain {
    @Test
    fun testConstant4() {
        assertEquals("constant function is 4", 4, constant4())
    }
}