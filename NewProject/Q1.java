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
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5/ 9;
        System.out.printf("%.if degree Fahrenheit is equal to %.1f Celsius. \n", fahrenheit, celsius);
        sc.close();
        
    }
}
