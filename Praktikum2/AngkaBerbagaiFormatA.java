package HackerRank.Praktikum2;

import java.util.*;
public class AngkaBerbagaiFormatA {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String bilangan = input.nextLine();
        int panjangInputan = bilangan.length();
    
        // desimal, pecahan campuran, pecahan biasa
        //  1.5   ||     3 3/5      ||    8/10
        //  Titik ||     spasi      ||    slash 

        // 3 3/5
        // 01234

        for (int i = 0; i<panjangInputan; i++) {
            if ((bilangan.substring(i, i+1)).equals(".")) {
                //berarti inputannya adalah angka desimal
                System.out.println("Desimal: " + bilangan);

                if ((bilangan.substring(i+1, i+2)).equals("0")) {
                    System.out.println("Pecahan Campuran: " + bilangan);
                    System.out.println("Pecahan: " + bilangan);
                    break;
                }
                
                if ((bilangan.substring(0, i)).equals("0")) {
                    System.out.println("Pecahan Campuran: " + bilangan);
                    System.out.println("Pecahan: " + bilangan);
                    break;
                }

                // Ubah ke pacahan
                // Tentukan dulu pembilang dan penyebutnya 
                // Pembilang / Penyebut 

                // Pembilang
                String pembilangString = bilangan.substring(0, i) + bilangan.substring(i+1, panjangInputan);
                // ex. 34.57
                // pembilang = 3457
                int pembilang = Integer.parseInt(pembilangString);
                // Penyebut
                int berapaAngkaDiBelakangKoma = (bilangan.substring(i+1, panjangInputan)).length();
                int penyebut =  (int) Math.pow(10, berapaAngkaDiBelakangKoma);
                
                // Mencari fpb
                int fpb = 0;
                for (int j = 1; j<= pembilang && j<= penyebut; j++) {
                    if (pembilang%j == 0 && penyebut%j == 0) {
                        fpb = j;
                    }
                }

                // Menyederhanakan pembilang dan penyebut 
                int pembilangSederhana = pembilang/fpb;
                int penyebutSederhana = penyebut/fpb;

                // Ini buat pecahan campuran
                int angkaSendiri = pembilang/penyebut;
                int angkaDiAtas = pembilangSederhana%penyebutSederhana;
                int angkaDiBawah = penyebutSederhana;

                // Tampilkan
                System.out.println("Pecahan campuran: " + angkaSendiri + " " + angkaDiAtas + "/" + angkaDiBawah);
                System.out.println("Pecahan: " + pembilangSederhana + "/" + penyebutSederhana);
                break;
            } else if ((bilangan.substring(i, i+1)).equals(" ")) { // buat pecahan campuran
                // 3 2/5
                // 9 89/98

                // angka sendiri
                String angkaSendiriString = bilangan.substring(0, i);
                int angkaSendiri = Integer.parseInt(angkaSendiriString);
                // pisahin angka setelah spasi
                String angkaSetelahSpasi = bilangan.substring(i+1, panjangInputan);
                String[] pisahkanAngka = angkaSetelahSpasi.split("/");
                // Gambaran array = {"2", "5"}
                //                    0    1

                // Angka di Atas
                String angkaDiAtasString = pisahkanAngka[0];
                int angkaDiAtas = Integer.parseInt(angkaDiAtasString);
                // Angka di Bawah
                String angkaDiBawahString = pisahkanAngka[1];
                int angkaDiBawah = Integer.parseInt(angkaDiBawahString);
                
                // pecahan campuran -> pecahan biasa 
                // ex. 3 2/5 ->
                // pembilang (3*5)+2 (angka sendiri dikali angka di bawah ditambah angka di atas)
                // penyebut 5 (angka di bawah)

                // Pembilang dan penyebut 
                int pembilang = (angkaSendiri*angkaDiBawah) + angkaDiAtas;
                int penyebut = angkaDiBawah;

                // Desimal
                double desimal = ((1.0) * pembilang) / penyebut;
                // Mencari fpb
                int fpb = 0;
                for (int j = 1; j<= pembilang && j<= penyebut; j++) {
                    if (pembilang%j == 0 && penyebut%j == 0) {
                        fpb = j;
                    }
                }

                // Menyederhanakan pembilang dan penyebut 
                int pembilangSederhana = pembilang/fpb;
                int penyebutSederhana = penyebut/fpb;
                
                if (penyebutSederhana == 1){
                    System.out.println("Desimal: " + desimal);
                    System.out.println("Pecahan campuran: " + desimal);
                    System.out.println("Pecahan: "+desimal);
                    break;
                }

                // Ini buat pecahan campuran
                int angkaSendiriSederhana = pembilang/penyebut;
                int angkaDiAtasSederhana = pembilangSederhana%penyebutSederhana;
                int angkaDiBawahSederhana = penyebutSederhana;

                System.out.println("Desimal: " + desimal);
                System.out.println("Pecahan campuran: " + angkaSendiriSederhana + " " + angkaDiAtasSederhana + "/" + angkaDiBawahSederhana);
                System.out.println("Pecahan: " + pembilangSederhana + "/" + penyebutSederhana);
                break;

            } else if ((bilangan.substring(i, i+1)).equals("/")) { // buat pecahan biasa
                // 8/10
                // 0123

                // Pembilang
                String pembilangString = bilangan.substring(0, i);
                int pembilang = Integer.parseInt(pembilangString);
                // Penyebut 
                String penyebutString = bilangan.substring(i+1, panjangInputan);
                int penyebut = Integer.parseInt(penyebutString);

                // Desimal
                double desimal = ((1.0) * pembilang) / penyebut;                  
                // Mencari fpb
                int fpb = 0;
                for (int j = 1; j<= pembilang && j<= penyebut; j++) {
                    if (pembilang%j == 0 && penyebut%j == 0) {
                        fpb = j;
                    }
                }

                // Menyederhanakan pembilang dan penyebut 
                int pembilangSederhana = pembilang/fpb;
                int penyebutSederhana = penyebut/fpb;
                
                if (penyebutSederhana == 1){
                    System.out.println("Desimal: " + desimal);
                    System.out.println("Pecahan campuran: " + desimal);
                    System.out.println("Pecahan: "+desimal);
                    break;
                }

                // Ini buat pecahan campuran
                int angkaSendiri = pembilang/penyebut;
                int angkaDiAtas = pembilang%penyebut;
                int angkaDiBawah = penyebutSederhana;

                System.out.println("Desimal: " + desimal);
                if (angkaSendiri == 0) {
                    System.out.println("Pecahan campuran: " + pembilangSederhana + "/" + penyebutSederhana);
                    System.out.println("Pecahan: " + pembilangSederhana + "/" + penyebutSederhana);
                    break;
                }
                
                System.out.println("Pecahan campuran: " + angkaSendiri + " " + angkaDiAtas + "/" + angkaDiBawah);
                System.out.println("Pecahan: " + pembilangSederhana + "/" + penyebutSederhana);
                break;
            } else if (bilangan.equals("0")) {
                System.out.println("Desimal: 0");
                System.out.println("Pecahan campuran: 0");
                System.out.println("Pecahan: 0");
            }
            
        }
    }
}

