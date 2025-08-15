package LabExercises;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author User
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name:");
        String name = sc.nextLine();
        System.out.print("Enter Date of Birth:");
        String name1 = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("Age:");
        String age = sc.nextLine();
        System.out.print("Course:");
        String course = sc.nextLine();
        System.out.print("Year Level:");
        String name2 = sc.nextLine();
        System.out.print("Secondary School Graduated:");
        System.out.print("Year:");
        String name4 = sc.nextLine();
        
        System.out.printf("========= PERSONAL INFO ========");
        System.out.printf("%-13s:%s\n", "Name", name);
        System.out.printf("%-13s:%s\n", "Date of Birth", name1);
        System.out.printf("%-13s:%s\n", "Address", address);
        System.out.printf("%-13d:%d\n", "Age", age);
        System.out.printf("%-13s:%s\n", "Course", course);
        System.out.printf("%-13s:%d\n", "Year Level", name2);
        
        System.out.printf("========= PERSONAL INFO ==========");
        System.out.printf("SECONDARY LEVEL");
        System.out.printf("%-13:%d\n", "Year", name4);
        
        
        
    }
    
}
