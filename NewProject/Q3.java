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
public class Q3 {
    public static void main(String[] args) {   
        Scanner input = new Scanner (System.in);
           System.out.print("INput the number of minutes: ");
           double min = input.nextDouble();
           double f1 = 60 * 24 * 365;
           long years = (long) (min / f1);
           int days = (int) (min / 60 / 24) % 365;
           System.out.println((int) min + "minutes is approximately" + years + "years and " + days + "days");
           
    }
}
