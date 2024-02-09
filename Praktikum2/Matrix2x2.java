package HackerRank.Praktikum2;

import java.util.Scanner;

public class Matrix2x2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String a1,b1,c1,d1,a2,b2,c2,d2;

        a1 = input.next();
        b1 = input.next();
        c1 = input.next();
        d1 = input.next();
        a2 = input.next();
        b2 = input.next();
        c2 = input.next();
        d2 = input.next();

        int e1 = Integer.parseInt(a1);
        int f1 = Integer.parseInt(b1);
        int g1 = Integer.parseInt(c1);
        int h1 = Integer.parseInt(d1);
        int e2 = Integer.parseInt(a2);
        int f2 = Integer.parseInt(b2);
        int g2 = Integer.parseInt(c2);
        int h2 = Integer.parseInt(d2);
       

        System.out.println(d2);

    // Pertambahan
        int penjumlahan1 = e1 + e2; 
        int penjumlahan2 = f1 + f2; 
        int penjumlahan3 = g1 + g2; 
        int penjumlahan4 = h1 + h2; 

    // Pengurangan 
        int pengurangan1 = e1 - e2; 
        int pengurangan2 = f1 - f2; 
        int pengurangan3 = g1 - g2; 
        int pengurangan4 = h1 - h2; 

    // Perkalian 
        int perkalian1 = ((e1*e2) + (f1*g2));
        int perkalian2 = ((e1*f2) + (f1*h2));
        int perkalian3 = ((g1*e2) + (h1*g2));
        int perkalian4 = ((g1*f2) + (h1*h2));

    // Output

    System.out.println("Hasil pertamahan");
    System.out.println(penjumlahan1 + " " + penjumlahan2);
    System.out.println(penjumlahan3 + " " + penjumlahan4);
    System.out.println("");
    System.out.println("Hasil pengurangan");
    System.out.println(pengurangan1 + " " + pengurangan2);
    System.out.println(pengurangan3 + " " + pengurangan4);
    System.out.println("");
    System.out.println("Hasil perkalian");
    System.out.println(perkalian1 + " " + perkalian2);
    System.out.println(perkalian3 + " " + perkalian4);

    input.close();
    }
}
