/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.Scanner;
        
/**
 *
 * @author ASUS
 */
public class caesarsCipher {
    
static String getString() {
    String s;
    System.out.println("Podaj tekst: ");
    Scanner sc = new Scanner(System.in);
    s = sc.nextLine();
    return s;
}

static String encode(String text) {
    String encrypted = "";
    for(int i = 0; i < text.length(); i++) {
        if(text.charAt(i) >= 65 && text.charAt(i) <= 90) {
            if(text.charAt(i) + 3 > 'Z') {
                encrypted += (char) (text.charAt(i) - 23);
            } else {
                encrypted += (char) (text.charAt(i) + 3);
            }
        } else if (text.charAt(i) >= 97 && text.charAt(i) <= 122) {
            if(text.charAt(i) + 3 > 'z') {
                encrypted += (char) (text.charAt(i) - 23);
            } else {
                encrypted += (char) (text.charAt(i) + 3);
            }
            } else {
            encrypted += text.charAt(i);
        }
    }
    return encrypted;
}

static String decode(String text) {
    String decrypted = "";
    for(int i = 0; i < text.length(); i++) {
        if(text.charAt(i) >= 65 && text.charAt(i) <= 90) {
            if(text.charAt(i) - 3 < 'A') {
                decrypted += (char) (text.charAt(i) + 23);
            } else {
                decrypted += (char) (text.charAt(i) - 3);
            }
        } else if(text.charAt(i) >= 97 && text.charAt(i) <= 122) {
            if(text.charAt(i) - 3 < 'a') {
                decrypted += (char) (text.charAt(i) + 23);
            } else {
                decrypted += (char) (text.charAt(i) - 3);
            }
        } else {
            decrypted += text.charAt(i);
        }
    }
    return decrypted;
}

static boolean ifPalindrome(String text) {
    for(int i = 0; i < text.length(); i++) {
        if(text.charAt(i) != text.charAt(text.length()-i-1)) return false;
    }
    return true;
}
}
