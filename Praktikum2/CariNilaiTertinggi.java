package HackerRank.Praktikum2;

import java.util.Scanner;
import java.util.*;

public class CariNilaiTertinggi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa = ");
        int jumlahSiswa = input.nextInt();
        System.out.print("Masukkan jumlah latihan = ");
        int jumlahLatihan = input.nextInt();
        Double dataNilai[][] = new Double[jumlahSiswa][jumlahLatihan];
        String namaSiswa[] = new String[jumlahSiswa];
        float rataRataKelas = 0;
        float nilaiTertinggi = 0;
        String namaAnakTertinggi = "";
        float rataRataSiswa[] = new float[jumlahSiswa];
        
        

        // Menginput nama, nilai, dan rata-rata tiap siswa
        for(int i=0; i<jumlahSiswa; i++){
            // System.out.println("Masukan nama siswa = ");
            namaSiswa[i] = input.next();
            for(int j=0; j<jumlahLatihan; j++){
                // System.out.println("Masukkan nilai = ");
                dataNilai[i][j] = input.nextDouble();
                rataRataSiswa[i]+= dataNilai[i][j];
                
                rataRataSiswa[i]/= jumlahLatihan;
                if(rataRataSiswa[i]> nilaiTertinggi){
                    nilaiTertinggi = rataRataSiswa[i];
                    namaAnakTertinggi = namaSiswa[i];
            }
            }
            rataRataKelas += rataRataSiswa[i];
            System.out.println(rataRataKelas);
            System.out.printf("Rata-rata nilai mahasiswa %s adalah %.2f \n", namaSiswa[i], rataRataSiswa[i]);
        }
         // Menghitung rata-rata kelas
         rataRataKelas /= jumlahSiswa;

         System.out.printf("Rata-rata kelas: %.2f\n", rataRataKelas);
         System.out.printf("Mahasiswa yang memiliki nilai tertinggi adalah %s dengan nilai %.2f", namaAnakTertinggi, nilaiTertinggi);



        
    }
}
