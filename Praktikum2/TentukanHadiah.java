package HackerRank.Praktikum2;

import java.util.Scanner;

public class TentukanHadiah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      String username;
      username = input.nextLine();
      String usernameValid = username.substring(0, 1);
      String hurufKedua = username.substring((int) 1., 2);
      int panjangNama = username.length() - 1;
   
      switch(usernameValid){
         case"@":
         if(panjangNama % 2 == 0){
            switch(hurufKedua){
               case"A":
               case"B":
               case"C":
               case"D":
               case"E":
               System.out.println("Reward anda : Meet n Greet");
               break;
               default:
               System.out.println("Reward anda : Pulsa");
               break;
            }
         } else if (panjangNama % 2 == 1){
            switch(hurufKedua){
               case"A":
               case"B":
               case"C":
               case"D":
               case"E":
               System.out.println("Reward anda : Paket Merchandise");
               default:
               System.out.println("Reward anda : E-Money");
            }
         }
         break;
         default:
         System.out.println("Username tidak valid");
      }

      input.close();
    }
}
