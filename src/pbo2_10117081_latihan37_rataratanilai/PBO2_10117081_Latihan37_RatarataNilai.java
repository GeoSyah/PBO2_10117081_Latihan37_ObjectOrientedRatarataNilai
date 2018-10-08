/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan37_rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Program penghitungan rata-rata
 */
public class PBO2_10117081_Latihan37_RatarataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        
        Nilai nilai1 = new Nilai();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nilai1.jumSiswa = baca.nextInt();
        nilai1.inputHitungNilai( nilai1.jumSiswa, nilai1.nilai);
        System.out.println("Maka Rata - Ratanya : "+nilai1.rataRataNilai());
    }
    
}
