/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.quangnv.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.quangnv.mathutil.core.MathUltility;

/**
 *
 * @author _viet.quangg
 */
public class MathUltilityTest {

    @Test
    public void testFactorialGivenRightArgumentRunsWell() {
//        assertEquals(69, 69);

        assertEquals(1, MathUltility.getFactorial(0));
        assertEquals(1, MathUltility.getFactorial(1));
        assertEquals(2, MathUltility.getFactorial(2));
        assertEquals(6, MathUltility.getFactorial(3));
        assertEquals(120, MathUltility.getFactorial(5));


    }
}
