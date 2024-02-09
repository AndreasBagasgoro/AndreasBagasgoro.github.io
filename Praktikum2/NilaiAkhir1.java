package HackerRank.Praktikum2;

import java.util.Scanner;

public class NilaiAkhir1 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        double tugas, quiz, uts, uas, keaktifan, kumulatif;
        
        tugas = input.nextDouble();
        quiz = input.nextDouble();
        uts = input.nextDouble();
        uas = input.nextDouble();
        keaktifan = input.nextDouble();
        
        kumulatif = tugas*2/10 + quiz*1/10 + uts*3/10 + uas*3/10 + keaktifan*1/10;
        
        System.out.printf("Nilai akhir: %d", Math.round(kumulatif));
    
        input.close();
    }
}
