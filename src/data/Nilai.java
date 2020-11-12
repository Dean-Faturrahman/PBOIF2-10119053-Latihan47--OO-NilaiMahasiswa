/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Dean
 */
public class Nilai {
    private double quiz;
    private double uts;
    private double uas;

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double nilaiAkhir(){
        return (getQuiz()*0.2) + (getUts()*0.3) + (getUas()*0.5);
    }
    
    public char index(){
        char indexx;
        if ((nilaiAkhir()>=80)) {
            indexx = 'A';
        } else if ((nilaiAkhir()>=68) && (nilaiAkhir()<80)){
            indexx = 'B';
        } else if ((nilaiAkhir()>=56) && (nilaiAkhir()<68)){
            indexx = 'C';
        } else if ((nilaiAkhir()>=45) && (nilaiAkhir()<56)){
            indexx = 'D';
        } else {
            indexx = 'E';
        }
        return indexx;
    }
    
    public void keterangan(char index){
        switch (index) {
            case 'A':
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("Baik");
                break;
            case 'C':
                System.out.println("Cukup");
                break;
            case 'D':
                System.out.println("Kurang");
                break;
            default:
                System.out.println("Sangat Kurang");
                break;
        }
    }
}
