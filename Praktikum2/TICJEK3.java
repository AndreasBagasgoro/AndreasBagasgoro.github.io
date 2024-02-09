package HackerRank.Praktikum2;

import java.util.Scanner;

public class TICJEK3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("----------------------------------------------------");
        System.out.println("TIC JEK");
        System.out.println("----------------------------------------------------");
        System.out.print("Masukkan total hari yang ingin direkap : ");
        int hari = input.nextInt();
        int Km =0;
        int totalKm = 0;
        int biayaTotal = 0;
        int pendapatan = 0;
        int potongan = 0;
        for(int i=0; i < hari ; i++){
            System.out.println("Hari ke " + (i+1));
            System.out.print("Jumlah order : ");
            int jumlahOrderan = input.nextInt();
            for(int j=0; j < jumlahOrderan; j++){
                System.out.print("Order ke - " + (j+1) + " : ");
                Km = input.nextInt();
                totalKm += Km;
                
            }
            biayaTotal = 2000 * totalKm;
            pendapatan = biayaTotal * 80/100;
            potongan = biayaTotal * 20/100;
        }
        System.out.println("----------------------------------------------------");
        System.out.print("Total Km     = ");
        System.out.println(totalKm);
        System.out.print("Biaya Total  = Rp");
        System.out.println(biayaTotal);
        System.out.print("Pendapatan   = Rp");
        System.out.println(pendapatan);
        System.out.print("Potongan     = Rp");
        System.out.println(potongan);
    }
}
