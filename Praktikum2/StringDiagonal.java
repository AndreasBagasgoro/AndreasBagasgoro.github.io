package HackerRank.Praktikum2;

import java.util.*;

public class StringDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = input.nextLine();

        for(int i=0; i<kalimat.length();){
            
            System.out.println(kalimat.charAt(i));
            i++;
            for(int j=0; j<i;){
                System.out.print(" ");
                j++;
            }
            
        }
    }
}
