/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compoundinterest;

/**
 *
 * @author Phelembe Phetolo
 */
import java.util.Scanner;

public class Compoundinterest {

    public static void main(String[] args) {
        
        Scanner Tlhalefang=new Scanner(System.in);
        
        
        System.out.println("kindly enter the principal Amount "+"R");
        
        double P=Tlhalefang.nextDouble();
        
        System.out.println("kindly enter the interest Amount ");
        
        double I=Tlhalefang.nextDouble();
        
        System.out.println("kindly enter the number of years");
        
        double N=Tlhalefang.nextDouble();
        
     double   A=P*Math.pow(1+I,N);
     
     System.out.println("your compount interest after "+N +"years is " +": "+"R"+A);
    }
}
