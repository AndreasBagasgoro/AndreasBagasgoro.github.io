package HackerRank.Praktikum2;

import java.util.Scanner;;

public class Investor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int banyakProyek = input.nextInt();
        int proyekTerbaik = 0;
        double profitTerbesar = 0.0;

        for(int y =0; y < banyakProyek; y++){

        double modalAwal, tahunPengebalian, persenKenaikan;
        modalAwal = input.nextDouble();
        tahunPengebalian = input.nextDouble();
        persenKenaikan = input.nextDouble();

        double profit= (modalAwal * Math.pow(1.00+persenKenaikan/100.00, tahunPengebalian) - modalAwal);

        if(profit > profitTerbesar) {
            profitTerbesar = profit; 
            proyekTerbaik = y+1;
        }
        
        }
        System.out.printf("%d = %.2f", proyekTerbaik, profitTerbesar);

    }
}
