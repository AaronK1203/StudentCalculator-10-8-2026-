/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.studentcalculator;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BLAZE
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    

    /**
     * Test of add method, of class Calculator.
     */
    @org.junit.Test
    public void testAdd() {
        System.out.println("add");
        double a = 3.0;
        double b = 2.0;
        Calculator instance = new Calculator();
        double expResult = 5.0;
        double result = instance.add(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @org.junit.Test
    public void testSubtract() {
        System.out.println("subtract");
        double a = 5.0;
        double b = 2.0;
        Calculator instance = new Calculator();
        double expResult = 3.0;
        double result = instance.subtract(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @org.junit.Test
    public void testMultiply() {
        System.out.println("multiply");
        double a = 5.0;
        double b = 3.0;
        Calculator instance = new Calculator();
        double expResult = 15.0;
        double result = instance.multiply(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @org.junit.Test
    public void testDivide() {
        System.out.println("divide");
        double a = 6.0;
        double b = 2.0;
        Calculator instance = new Calculator();
        double expResult = 3.0;
        double result = instance.divide(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
