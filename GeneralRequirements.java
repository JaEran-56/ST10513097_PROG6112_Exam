/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.generalrequirements;

/**
 *
 * @author Pedro
 */
import java.util.Scanner;
public class GeneralRequirements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Declaring variables
        String name;
        double mark1 = 0;
        double mark2 = 0;
        double mark3 = 0;
        double mark;
        
        System.out.print("Enter students name: ");
        name = input.nextLine();
        
        //Using a for loop o repeat a sentence
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter student mark " + i + ":");
            mark = input.nextDouble();
            
        if (i == 1) {
            mark1 = mark;
        } else if (i == 2) {
            mark2 = mark;
        } else {
            mark3 = mark;
        }
        }
        //Calculating the mark average
        double average = (mark1 + mark2 + mark3) / 3;
        
        //Checking if the student passed
        if (average >= 50) {
            System.out.println("Student Passed!");
        } else {
            System.out.println("Student Failed!");
        }
        
        //Displaying the students information
        System.out.println("Student name: " + name);
        System.out.println("Student average: " + average);
        
        input.close();
    }
}