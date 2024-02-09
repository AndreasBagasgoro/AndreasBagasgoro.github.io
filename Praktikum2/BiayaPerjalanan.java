package HackerRank.Praktikum2;

import java.util.Scanner;

public class BiayaPerjalanan {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        double jarak , biaya;
        
        jarak = input.nextDouble();
        
        biaya = jarak * 3000;
        
        System.out.printf("Total tarif yang harus dibayar adalah = Rp%.2f" , biaya );
        input.close();
    }
}
