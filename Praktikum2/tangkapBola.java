package HackerRank.Praktikum2;

import java.util.Scanner;
public class tangkapBola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sudutElevasi,kecepatanKmh,durasJatuh,tinggiGedung;
        
        sudutElevasi = input.nextDouble();
        kecepatanKmh = input.nextDouble();

        durasJatuh = 6.0;
        tinggiGedung =  50;

        double kecepatanMs = kecepatanKmh / 3.6;
        double sudutRad = Math.toRadians(sudutElevasi);

        double jarakHorizontal = durasJatuh * kecepatanMs * Math.cos(sudutRad);

        boolean dapatMenangkap; 

        dapatMenangkap = jarakHorizontal <= tinggiGedung;

        System.out.printf("Jaral horizontal bola terhadap gedung: %.0f meter " ,tinggiGedung );
        System.out.printf("Peserta dapat menangkap bola: " ,dapatMenangkap);
    
        input.close();
    }
}
