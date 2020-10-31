/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan24.perbandinganduanilai;

import java.util.Scanner;

/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : program untuk membandingkan dua nilai
 */
public class PBOIF210119049Latihan24PerbandinganDuaNilai {
    public static Scanner scan = new Scanner(System.in);
    public static int[] arrNilai = new int[2];
    
    public static void setNilai(){
        System.out.print("Masukkan Nilai Pertama : ");
        arrNilai[0] = scan.nextInt();
        
        System.out.print("Masukkan Nilai Kedua   : ");
        arrNilai[1] = scan.nextInt();
    }
    
    public static void setTampilHasil(){
       if(arrNilai[0] < arrNilai[1]){
           System.out.printf("Hasil : %d Lebih kecil dari %d", arrNilai[0], arrNilai[1]);
       }
       else if(arrNilai[0] > arrNilai[1]){
           System.out.printf("Hasil : %d Lebih besar dari %d", arrNilai[0], arrNilai[1]);
       }
       else{
           System.out.printf("Hasil : %d Sama dengan %d%n", arrNilai[0], arrNilai[1]);
       }
    }
    
    public static void main(String[] args) {
        boolean isStop = false;
        String tempStr;
        
        System.out.println("=====Program Perbandingan Nilai=====");
        
        do{
            setNilai();
            setTampilHasil();
            
            System.out.printf("%n%nUlangi Aktivitas ? [Y/N] : ");
            tempStr = scan.next();
            
            if(tempStr.equals("n") || tempStr.equals("N")){
                isStop = true;
            }    

//            System.out.println("is Stop : " + isStop);
//            System.out.println("tempStr : " + tempStr);
        }
        while(!isStop);
    }
    
}
