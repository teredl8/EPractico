/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.digitoverificardor;

/**
 *
 * @author tere
 */
public class DigitoVerificardor {

    public static void main(String[] args) {
        int number = 19217;
        
        int output = getVerificationDigit(number);
        
        System.out.println("El dígito verificador de la cantidad " +number+ " es: "+output);
           
    }
    
    public static int getVerificationDigit(int number) {
        String numberString = String.valueOf(number);
        int[] digits = new int[numberString.length()];
        int[] numberWeight = new int[numberString.length()];
        int sum = 0;
        int verificationDigit = 0; 
        
        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }
        
        //Paso 1 y 2
        for (int i = digits.length - 1; i >= 0; i--) {
            // Número de dígitos es par
            if(digits.length % 2 == 0) { 
                if(i == 0) {
                    numberWeight[i] = digits[i];
                } else if (i % 2 == 0) {
                    numberWeight[i] = digits[i];
                } else {
                    numberWeight[i] = digits[i] * 2;
                }
            } else { // Número de dígitos es impar
                if(i == 0) {
                    numberWeight[i] = digits[i] * 2;
                } else if (i % 2 == 0) {
                    numberWeight[i] = digits[i] * 2;
                } else {
                    numberWeight[i] = digits[i];
                }
            }
        }
        
        //Paso 3 
        for (int i = 0; i < numberWeight.length; i++) {
            if(numberWeight[i] > 9) {
                sum = sum + 1 + numberWeight[i]%10;
            } else {
                sum = sum + numberWeight[i];
            }
        }
        //Paso 4 y 5
        if(sum % 10 == 0) {
            return verificationDigit;
        } else {
            return verificationDigit = 10 - (sum % 10);
        }
    }
}
