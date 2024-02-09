package HackerRank.Praktikum2;

import java.util.Scanner;

public class Reamur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double r, c, k, f;
        
        r = input.nextDouble();
        
        c = 5 * r / 4;
        k = 5 * r / 4 + 273;
        f = 9 * r / 4 + 32;
        
        
        System.out.println("Suhu dalam Reamur: " + r + " R");
        System.out.println("Suhu dalam Celcius: " + c + " R");
        System.out.println("Suhu dalam Kelvin: " + k + " R");
        System.out.println("Suhu dalam Farenheit: " + f + " R");
    
        input.close();
    }
}
