package HackerRank.Praktikum2;

import java.util.Scanner;

public class UmurKeluarga {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        int ayah, ibu, kakak, adik;
        
        ayah = input.nextInt();
        kakak = ayah / 4;
        adik = (kakak - 3) / 2;
        ibu = kakak * 3 + adik;
        
        int ayah1, ibu1, kakak1, adik1, n;
        
        n = input.nextInt();
        
        ayah1 = ayah + n;
        kakak1 = kakak + n;
        adik1 = adik + n;
        ibu1 = ibu + n;
        
        System.out.printf("Umur anggota keluarga saat ini adalah:\n");
        System.out.printf("Ayah: %d tahun\n", ayah);
        System.out.printf("Ibu: %d tahun\n", ibu);
        System.out.printf("Kakak: %d tahun\n", kakak);
        System.out.printf("Adik: %d tahun\n", adik);
        System.out.printf("---------------\n");
        System.out.printf("Umur anggota keluarga %d tahun lagi adalah:\n", n);
        System.out.printf("Ayah: %d tahun\n", ayah1);
        System.out.printf("Ibu: %d tahun\n", ibu1);
        System.out.printf("Kakak: %d tahun\n", kakak1);
        System.out.printf("Adik: %d tahun\n", adik1);

        input.close();
    }
}
