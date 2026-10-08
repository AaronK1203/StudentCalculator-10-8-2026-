/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentcalculator;

/**
 *
 * @author Aaron Kempenich
 */
public class Calculator {
    public Calculator(){
        
    }
    
    public double add(double a,double b){
        return a+b;
    }
    
    public double subtract(double a,double b){
        return a-b;
    }
    
    public double multiply(double a,double b){
        return a*b;
    }
    public double divide(double a,double b) {
        if (b==0){
            if (a > 0){
                return Double.POSITIVE_INFINITY;
            } else if (a < 0) {
                return Double.NEGATIVE_INFINITY;
            } else {
                return 0;
            }
        }
        return a/b;
    }
    
}
