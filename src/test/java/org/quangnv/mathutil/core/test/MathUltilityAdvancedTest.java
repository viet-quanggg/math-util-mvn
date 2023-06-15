/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.quangnv.mathutil.core.test;

import java.lang.reflect.Executable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.quangnv.mathutil.core.MathUltility;
import static org.quangnv.mathutil.core.MathUltility.*;

/**
 *
 * @author _viet.quangg
 */
public class MathUltilityAdvancedTest {
    
    //hàm chuẩn bị bộ data test để sau đó fill vào hàm
    //assertE() ở dưới
    
    public static Object[][] initTestData(){
        Object testData[][] = {{0,1}, 
                               {1,1},
                               {2,2},
                               {4,24},
                               {6,720}};
        
        return testData;
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected) {
        assertEquals(expected, getFactorial(n));
    }
    
    public void testFactorialGivenWrongArgumentThrowsException(int n, long expected) {
        
//        org.junit.jupiter.api.function.Executable gF = new org.junit.jupiter.api.function.Executable() {
//            @Override
//            public void execute() throws Throwable {
//                MathUltility.getFactorial(-5);
//            }
//        };
        
        org.junit.jupiter.api.function.Executable gF = () -> MathUltility.getFactorial(-5);
        
        assertThrows(IllegalArgumentException.class, gF);
    }
}
