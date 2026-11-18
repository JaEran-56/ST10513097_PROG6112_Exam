/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productcalculations;

/**
 *
 * @author Student
 */
public class ProductCalculations implements IProductsCalculations {
   
    //Declaring variables
    double productPrice = 3500;
    double commission;
    double vat;
    
    @Override
    public double GetVat() {
        double vat = productPrice * 0.15;
        return vat;
    }

    @Override
    public double GetCommission() {
        double commission = productPrice * 0.05;
        return commission;
    }

    @Override
    public double GetTotal() {
        double commission = 0.05;
        double vat = 0.15;
        double total = productPrice + vat + commission;
        return total;
    }
    
    public static void main(String[] args) {
        
        ProductCalculations calc = new ProductCalculations();
        
        System.out.println("VAT:         " + calc.GetVat());
        System.out.println("Commission:  " + calc.GetCommission());
        System.out.println("Total Sale:  " + calc.GetTotal());
    }
}
