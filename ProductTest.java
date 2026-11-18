/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.product;

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
public class ProductTest {
    
    private final Product sales = new Product();
    
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        int expected = 153;
        int actual = sales.GetTotalProductsSold();
        assertEquals(expected, actual);
    }
    
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        int expected = 17;
        double actual = sales.GetAverageProductSold();
        assertEquals(expected, actual);
    }
}
