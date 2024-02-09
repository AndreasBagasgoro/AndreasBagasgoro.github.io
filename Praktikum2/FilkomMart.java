package HackerRank.Praktikum2;

import java.util.Scanner;

public class FilkomMart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String totalBelanja, jenisMember, tanggalPembelian;
        totalBelanja = input.nextLine();
        jenisMember = input.nextLine();
        tanggalPembelian = input.nextLine();
        
        input.close();
        
        String tanggalCantik, bulanCantik;
        tanggalCantik = tanggalPembelian.substring(0, 2);
        bulanCantik = tanggalPembelian.substring(3, 5);

        int totalBelanja1 = Integer.parseInt(totalBelanja);
        boolean valid = totalBelanja1 > 0 || totalBelanja1 < 100;
        double diskon = 0;
        double diskonTanggalCantik;

        if(valid == true){
            if(tanggalCantik.equalsIgnoreCase(bulanCantik)){
                if(totalBelanja1 >= 50000){
                    if(jenisMember.equalsIgnoreCase("gold")){
                        diskon = 0.1 * totalBelanja1;
                        totalBelanja1 -= diskon;
                        diskonTanggalCantik = 0.5 * totalBelanja1;
                        totalBelanja1 -= diskonTanggalCantik;
                    } else if(jenisMember.equalsIgnoreCase("platinum")){
                        diskon = 0.2 * totalBelanja1 ;
                        totalBelanja1 -= diskon;
                        diskonTanggalCantik = 0.5 * totalBelanja1;
                        totalBelanja1 -= diskonTanggalCantik;
                    } else {
                        diskon = 0.5 * totalBelanja1;
                        totalBelanja1 -= diskon;
                    }
            }  else {
                diskonTanggalCantik = 0.5 * totalBelanja1;
                totalBelanja1 -= diskonTanggalCantik;
            }
            } else {
                if(totalBelanja1 >= 50000){
                    if(jenisMember.equalsIgnoreCase("gold")){
                        diskon = 0.1 * totalBelanja1;
                        totalBelanja1 -= diskon;
                    } else if(jenisMember.equalsIgnoreCase("platinum")){
                        diskon = 0.2 * totalBelanja1 ;
                        totalBelanja1 -= diskon;
                    } else {
                        diskon = 0;
                    }
            }
        }
        System.out.println(totalBelanja1);
    }
    }
}
