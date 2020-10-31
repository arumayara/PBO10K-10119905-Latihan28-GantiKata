/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan28.GantiKata;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program mengganti Kata dalam kalimat
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner (System.in);
        String kalimat, diganti, pengganti;
        
        
        System.out.println("==== Program mengganti kata ====");
        System.out.println("Masukan Kalimat : ");
        kalimat = scanner.nextLine();
        System.out.println("Ganti Kata : ");
        diganti = scanner.nextLine();
        System.out.println("Menjadi Kata : ");
        pengganti = scanner.nextLine();
        
        System.out.println("======= Hasil Formating=======");
        System.out.printf("Kalimat Awal : %s\n", kalimat);
        System.out.printf("Kalimat Baru : %s", kalimat.replaceAll(diganti, pengganti));
        
    }
    
}
