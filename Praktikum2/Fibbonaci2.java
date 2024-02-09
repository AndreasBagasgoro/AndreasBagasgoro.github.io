package HackerRank.Praktikum2;

import java.util.*;

public class Fibbonaci2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int f_n,f_n_1,f_n_2,n;
        System.out.print("MMengambil nilai fibbonaci ke- : ");
        n = input.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        int i =1;

        while(i <= n){
            System.out.println("Nilai ke- "+i+" adalah "+f_n);
            f_n = f_n_2 + f_n_1;
            f_n_2 = f_n_1;
            f_n_1 = f_n;

            i++;
            
        }
        System.out.println("--------------------");
        do{
            System.out.println("Nilai ke- "+i+" adalah "+f_n);
            f_n = f_n_2 + f_n_1;
            f_n_2 = f_n_1;
            f_n_1 = f_n;

            i++;
        } while(i <=n);

    }

    
}
