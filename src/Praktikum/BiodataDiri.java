/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class BiodataDiri {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String nama, nis, tmp, tgl, jns, almt, motto;
        System.out.println();
        System.out.print("Biodata");
        System.out.println();
        System.out.print("Nama :");
        nama = masukan.nextLine();
        System.out.print("Nis :");
        nis = masukan.nextLine();
        System.out.print("Tempat lahir :");
        tmp = masukan.nextLine();
        System.out.print("Tanggal lahir :");
        tgl = masukan.nextLine();
        System.out.print("Jenis Kelamin :");
        jns = masukan.nextLine();
        System.out.print("Alamat di Malang :");
        almt = masukan.nextLine();
        System.out.print("Motto Hidup :");
        motto = masukan.nextLine();
    }
   
}
