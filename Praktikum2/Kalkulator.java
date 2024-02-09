package HackerRank.Praktikum2;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double bilanganPertama, bilanganKedua;
        char operator;

        bilanganPertama = input.nextDouble();
        operator = input.next().charAt(0);
        bilanganKedua = input.nextDouble();

        double hasil = 0;

        switch(operator){
            case'+':
            hasil = bilanganPertama + bilanganKedua;
            break;
            case'-':
            hasil = bilanganPertama - bilanganKedua;
            break;
            case'*':
            hasil = bilanganPertama * bilanganKedua;
            break;
            case'/':
            hasil = bilanganPertama / bilanganKedua;
            break;
            default:
            hasil = 0;
            break;
        }
            // Output

            System.out.printf("Hasil operasi: %.1f",hasil);
    
            input.close();
        }
}
