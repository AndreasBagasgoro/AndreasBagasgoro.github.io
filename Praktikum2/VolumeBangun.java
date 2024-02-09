package HackerRank.Praktikum2;

import java.util.Scanner;
public class VolumeBangun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String bentukBarang;
        double ukuran1, ukuran2, ukuran3, phi;
  
        bentukBarang = input.nextLine();
  
        if(bentukBarang.equalsIgnoreCase("balok")){
           ukuran1 = input.nextDouble();
           ukuran2 = input.nextDouble();
           ukuran3 = input.nextDouble();
           double volume = ukuran1*ukuran2*ukuran3*Math.pow(10, -6);
           System.out.printf("volume bangunan = %.5f m3", volume);
        }  else if(bentukBarang.equalsIgnoreCase("prisma segitiga")){
           ukuran1 = input.nextDouble();
           ukuran2 = input.nextDouble();
           ukuran3 = input.nextDouble();
           double volume = ukuran1*ukuran2*ukuran3/2*Math.pow(10, -6);
           System.out.printf("volume bangunan = %.5f m3", volume);
        }  else if(bentukBarang.equalsIgnoreCase("tabung")){
           ukuran1 = input.nextDouble();
           ukuran2 = input.nextDouble();
           if(ukuran1%7==0){
              double r = ukuran1/2;
              phi = 22/7;
              double volume = phi*Math.pow(r,2)*ukuran2*Math.pow(10, -6);
              System.out.printf("volume bangunan = %.5f m3", volume);
           } else {
              double r = ukuran1/2;
              phi = 3.14;
              double volume = phi*Math.pow(r,2)*ukuran2*Math.pow(10, -6);
              System.out.printf("volume bangunan = %.5f m3", volume);
           }
        }  else if(bentukBarang.equalsIgnoreCase("bola")){
           ukuran1 = input.nextDouble();
           if(ukuran1%7==0){
              phi = 22/7;
              double r = ukuran1/2;
              double volume = 4*phi*Math.pow(r, 3)/3*Math.pow(10, -6);
              System.out.printf("volume bangunan = %.5f m3", volume);
           } else {
              phi = 3.14;
              double r = ukuran1/2;
              double volume = 4*phi*Math.pow(r, 3)/3*Math.pow(10, -6);
              System.out.printf("volume bangunan = %.5f m3", volume);
           }
        }  
        
        input.close();
    }
}
