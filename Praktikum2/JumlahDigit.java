package HackerRank.Praktikum2;

import java.util.Scanner;

public class JumlahDigit {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        int angka, jumlahDigit = 0;
        
        angka = input.nextInt();
        
        while (angka > 0 && angka < 1000){
            jumlahDigit = jumlahDigit + angka % 10;
            angka = angka / 10;
        }
        
        System.out.println(jumlahDigit);

        input.close();
    }
}
