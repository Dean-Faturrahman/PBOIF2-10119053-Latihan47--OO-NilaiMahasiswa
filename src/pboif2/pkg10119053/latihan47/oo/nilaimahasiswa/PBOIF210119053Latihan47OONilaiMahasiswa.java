/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan47.oo.nilaimahasiswa;

import data.Nilai;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program nilai
 */
public class PBOIF210119053Latihan47OONilaiMahasiswa {

    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        
        nilai.setQuiz(30);
        System.out.println("QUIZ = " + nilai.getQuiz());
        nilai.setUts(80);
        System.out.println("UTS  = " + nilai.getUts());
        nilai.setUas(40);      
        System.out.println("UAS  = " + nilai.getUas());        
        System.out.println("\nNilai Akhir = " + nilai.nilaiAkhir());
        System.out.println("\nIndex = " + nilai.index());
        System.out.print("Keterangan = ");
        nilai.keterangan(nilai.index());
    }
    
}
