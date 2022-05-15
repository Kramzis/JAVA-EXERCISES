/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //System.out.println("zadanie 3.1");
     //lab3.checkChar('a', "Ala ma kota");
     //lab3.checkChar('y', "Ala ma kota");
     //lab3.checkChar('A', "Ala ma kota");
     
     //System.out.println("zadanie 3.2");
     //lab3.sumASCII("AScii....45,,/[]r33424ASKL");
     
     //System.out.println("zadanie 3.3");
     //System.out.println(lab3.integerToChar());
     
     System.out.println("zadanie 3.4");
     String text = caesarsCipher.getString();
     String encrypted = caesarsCipher.encode(text);
     System.out.println(encrypted);
     String decrypted = caesarsCipher.decode(encrypted);
     System.out.println(decrypted);
     System.out.println(caesarsCipher.ifPalindrome("ala"));
    }
}

class lab3 {

static void checkChar(char c, String s){
    int counter = 0;
        for(char z : s.toCharArray()){
            if (c == z) {
                counter++;
            }
        }
    if(counter == 0) {
        System.out.println("Brak znaku " + c + " w danym ciagu.");  
    } else {
        System.out.println("Znak " + c + " wystepuje w danym ciagu " + counter + " razy.");
    }
}

static void sumASCII(String s) {
    int temp = 0;
    for(char c: s.toCharArray()) {
        if(c > 47 && c < 58 || c > 96 && c < 123) {
            temp += c;
        }
    }
    System.out.println("Suma wartosci kodow ASCII podanego ciagu wynosi: " + temp);
}

static char integerToChar() {
    System.out.println("Podaj liczbe z zakresu od 33 do 126: ");
    Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i >= 33 && i <= 126) {
            System.out.println("Znak przypisany do podanej liczby to: ");
            return (char)i;
        } else return '1';
}

}


