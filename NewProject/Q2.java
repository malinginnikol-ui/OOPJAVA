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
public class Q2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Value for inches : ");
        float inches = sc.nextFloat();
        double meters = (inches * 0.0254);
        System.out.println(inches + " inches is" + meters + "meters ");
        
         
    }
}
