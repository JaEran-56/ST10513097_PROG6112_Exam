/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.product;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class Product implements IProducts {

    private int[][] mattressSales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
    private String[] matressesProducts = {"Nights Monarch", "Rostonic Barbados", "Sealy Phuket"};
    
    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < mattressSales.length; i++) {
            for (int j = 0; j < mattressSales[i].length; j++) {
                total += mattressSales[i][j];
            }
        }
        return total;
    }

    @Override
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

    @Override
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
    
    //Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Product sales = new Product();
        
        //Two-dimensional arrays and one-dimensional arrays
        int[][] mattressSales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        String[] mattresses = {"Cozy Nights Monarch", "Rostonic Barbados", "Sealy Phuket"};
        int[][] mattressesSold = new int[3][3];
        
        for (int i = 0; i < mattressesSold.length; i++) {
            System.out.print("Enter number of sales for month 1 for " + mattresses[i] + " mattress: ");
            mattressesSold[i][0] = input.nextInt();
            
            System.out.print("Enter number of sales for month 2 for " + mattresses[i] + " mattress: ");
            mattressesSold[i][1] = input.nextInt();
            
            System.out.print("Enter number of sales for month 3 for " + mattresses[i] + " mattress: ");
            mattressesSold[i][2] = input.nextInt();
            
        }
        
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("\n**************************************************");
        System.out.println("TOTAL PRODUCT SALES:     " + sales.GetTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES:   " + sales.GetAverageProductSold());
        System.out.println("MOST POPULAR PRODUCT:    " + sales.GetMostPopularProduct());
    }
}
