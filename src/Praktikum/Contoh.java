/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author USER
 */
public class Contoh {
    public static void main(String[] args) {
        
        int k,l,m,n;
        for(k=1;k<=5;k++) {
            for (l=1;l<=1;l++) {
             System.out.print("@");  
            }
            for(m=2;m<=5;m++){
                if(k==m) {
                    System.out.print("@");
                }
                else {
                    System.out.print(" ");
                }
                    }
            for(n=1;n<=1;n++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
