package HackerRank.Praktikum2;

import java.util.Scanner;

public class Pemdas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String bangunan ="";
        do{
            bangunan = input.nextLine();
            if(!bangunan.equalsIgnoreCase("persegi")&&!bangunan.equalsIgnoreCase("segitiga")){
                System.out.println("Bangungan tidak valid");
            } else {
                break;
            }
        }
        while (bangunan.equalsIgnoreCase("persegi") || bangunan.equalsIgnoreCase("segitiga")); {
            
            if(bangunan.equalsIgnoreCase("persegi")){
                double panjang = input.nextDouble();
                double lebar = input.nextDouble();
                System.out.print("Keliling persegi = ");
                System.out.println(kelilingPersegi(panjang,lebar));
                System.out.print("Luas persegi = ");
                System.out.println(luasPersegi(panjang, lebar));   
            } else if (bangunan.equalsIgnoreCase("segitiga")){
                double alas = input.nextDouble();
                double tinggi = input.nextDouble();
                double sisiMiring = 0;
                System.out.print("Keliling segitiga = ");
                System.out.println(kelilingSegitiga(alas, tinggi, sisiMiring));
                System.out.print("Luas segitiga = ");
                System.out.println(luasSegitiga(alas, tinggi));
            }
        }
            
        }
        static double luasPersegi(double panjang, double lebar){
            double luasPersegi = panjang*lebar;
            return luasPersegi;
    }

    static double kelilingPersegi(double panjang, double lebar){
        double kelilingPersegi = (2*panjang) + (2*lebar);
        return kelilingPersegi;
    }

    static double luasSegitiga(double alas, double tinggi){
        double luasSegitiga = alas*tinggi/2;
        return luasSegitiga;
    }

    static double kelilingSegitiga(double alas, double tinggi, double sisiMiring){
        sisiMiring = Math.sqrt((Math.pow(alas/2, 2)) + (Math.pow(tinggi, 2)));
        double kelilingSegitiga = (2*sisiMiring) + alas;
        return kelilingSegitiga;


    }
}
