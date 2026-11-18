/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.product;

/**
 *
 * @author Student
 */
public class PrintProduct {
    
    private int[][] mattressSales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
    
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < mattressSales.length; i++) {
            for (int j = 0; j < mattressSales[i].length; j++) {
                total += mattressSales[i][j];
            }
        }
        return total;
    }

    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = 0;
        
        for (int i = 0; i < mattressSales.length; i++) {
            for (int j = 0; j < mattressSales[i].length; j++) {
                count++;
            }
        }
        return (double) total / count;
        
    }

    public String GetMostPopularProduct() {
        int highestProduct = 0;
        
        for (int i = 0; i < mattressSales.length; i++) {
            for (int j = 0; j < mattressSales[i].length; j++) {
                if (mattressSales[i][j] > highestProduct) {
                    highestProduct = mattressSales[i][j];
                }
            }
        }
        return null;
        
    }
}
