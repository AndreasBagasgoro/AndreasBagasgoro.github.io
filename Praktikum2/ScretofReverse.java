package HackerRank.Praktikum2;

import java.util.*;

public class ScretofReverse {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        boolean kondisi = true;
        int angka = s.nextInt();
        int angka1=0;
        int reverseInt = 0;
        int jumlahAngka = 0;
        angka1 = angka;
        while(true){
            while(angka1!=0){

                reverseInt = reverseInt*10;
                reverseInt = reverseInt + angka1%10;
                angka1 = angka1/10;
                
                    
                }
                jumlahAngka = angka + reverseInt;
                System.out.println(jumlahAngka);
                
            
            
        }
    }
}
