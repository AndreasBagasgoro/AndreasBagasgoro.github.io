package HackerRank.Praktikum2;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int jumlahPrima, Angka, Cek, TotalPrima;
        
        TotalPrima = 0;
        jumlahPrima = input.nextInt();
        Angka = 2;
        
        while (true) {
            
            Cek = 0;
            
            for (int Pembagi = 1; Pembagi <= Angka; Pembagi++ ){
                if ((Angka%Pembagi)==0){
                    Cek++;
                }
            }
    
            if (Cek==2){
                System.out.print(Angka+" ");
                TotalPrima++;
            }
    
            Angka++;
    
            if (TotalPrima==jumlahPrima){
                break;
            }
    }
    input.close();
    }
}
