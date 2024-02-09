package HackerRank.Praktikum2;

import java.util.Scanner;

public class PenilaianMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilaiTugas, nilaiUTS, nilaiUAS;
        nilaiTugas = input.nextInt();
        nilaiUTS = input.nextInt();
        nilaiUAS =  input.nextInt();

        input.close();

        double nilaiAkhir = (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.5 * nilaiUAS);
        if(nilaiTugas < 40 || nilaiUTS < 40 || nilaiUAS < 40){
            System.out.println("Tidak Lulus");
        } else {
         if(nilaiAkhir >= 85){
            System.out.println("A");
        } else if(nilaiAkhir >= 70 && nilaiAkhir < 85){
            System.out.println("B");
        } else if(nilaiAkhir >= 55 && nilaiAkhir < 70){
            System.out.println("C");
        } else if(nilaiAkhir >= 40 && nilaiAkhir < 55){
            System.out.println("D");
        } else if(nilaiAkhir < 40){
            System.out.println("E");
        } 
    }
    }

}
