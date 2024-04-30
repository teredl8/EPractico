/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromo;

/**
 *
 * @author tere
 */
public class Palindromo {

    public static void main(String[] args) {
        String inputString = "Anita lava la tina";
        String inputLowercase = inputString.toLowerCase();
        
        String auxString = "";
        for (int i = 0; i < inputLowercase.length(); i++) {
            char caracter = inputLowercase.charAt(i);
            
            if(caracter != ' ') {
                auxString += caracter;
            }
        }
        
        char[] inputArray = auxString.toCharArray();
        int n = (inputArray.length / 2);
        
        for (int i = 0; i < n; i++) {
            if(inputArray[i] != inputArray[inputArray.length - 1 - i]) {
                System.out.println("La cadena \"" + inputString + "\" no es un palíndromo");
                return;
            }
        }
        
        System.out.println("La cadena \"" + inputString + "\" es un palíndromo");
    }
}
