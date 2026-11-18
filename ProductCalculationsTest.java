/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.productcalculations;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class ProductCalculationsTest {
    
    private final ProductCalculations calc = new ProductCalculations();
    
    @Test
    public void GetVat_ReturnsCorrectValue() {
       int expected = 525;
       double actual = calc.GetVat();
       assertEquals(expected, actual);
    }
    
    @Test
    public void GetTotal_WithValidData_ReturnsCorrectValue() {
        int expected = 4200;
        double actual = calc.GetTotal();
        assertEquals(expected, actual);
    }
}
