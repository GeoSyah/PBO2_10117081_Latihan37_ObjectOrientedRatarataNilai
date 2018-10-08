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
 * Deskripsi Kelas : Kelas berisi pengulangan dan perhitungan rata-rata nilai
 */
public class Nilai {
    public int jumSiswa;
    public double rataNilai;
    public double jumNilai;
    public double nilai;
    
    public void inputHitungNilai(int jumSiswa, double nilai){
        int i = 1;
        Scanner baca = new Scanner(System.in);
        while (i <= jumSiswa) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = baca.nextDouble();
            jumNilai = jumNilai + nilai;
            i = i + 1;
        }
        System.out.println("");
        
    }
    public double rataRataNilai(){
        
        return rataNilai = jumNilai / jumSiswa;
    }
}
