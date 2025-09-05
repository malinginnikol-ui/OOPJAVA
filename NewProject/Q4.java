/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NewProject;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q4 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

       
        double bmi = weight / (height * height);

        
        System.out.printf("Your BMI is: %.2f%n", bmi);

       
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        input.close();
    }
}
