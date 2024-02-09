package HackerRank.Praktikum2;

import java.util.Scanner;

public class TransaksiParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int kendaraan, durasi, uang;
        kendaraan = input.nextInt();
        durasi = input.nextInt();
        uang = input.nextInt();
        
        int biayaParkir = 0;
        if (kendaraan == 1) {
            biayaParkir = 2000 * durasi;
        } else if (kendaraan == 2) {
            biayaParkir = 4000 * durasi;
        } else if (kendaraan == 3) {
            biayaParkir = 9000 * durasi;
        }

        int kembalian = uang - biayaParkir;

        if (uang == biayaParkir) {
            System.out.println("Uang yang dibayarkan pas.");
        } else if (uang < biayaParkir) {
            System.out.println("Uang anda belum mencukupi.");
        } else {
            System.out.println("Anda mendapatkan kembalian sebesar:");
            int uang10k = kembalian / 10000;
            kembalian %= 10000;
            int uang5k = kembalian / 5000;
            kembalian %= 5000;
            int uang500 = kembalian / 500;
            kembalian %= 500;
            int uang100 = kembalian / 100;

            if (uang10k >= 0) {
                System.out.println(uang10k + " uang 10.000");
            }
            if (uang5k >= 0) {
                System.out.println(uang5k + " uang 5.000");
            }
            if (uang500 >= 0) {
                System.out.println(uang500 + " uang 500");
            }
            if (uang100 >= 0) {
                System.out.println(uang100 + " uang 100");
            }
        }
    }
}
