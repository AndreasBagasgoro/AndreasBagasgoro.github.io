package HackerRank.Praktikum2;

import java.util.Scanner;

public class Fibonacci {
  
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Masukkan nilai n");
    int nilaiN = input.nextInt();
    if(nilaiN < 0){
      System.out.println("Tidak ada");
    } else {
      System.out.println("Angka deret fibonacci ke - " + nilaiN + " adalah: " + hasil(nilaiN));
    }
    }
    public static int hasil(int nilaiN){
      if ( nilaiN == 0 || nilaiN==1){
        return nilaiN;
      } else {
        return hasil(nilaiN-1) + hasil(nilaiN-2);
      }
  }
}
