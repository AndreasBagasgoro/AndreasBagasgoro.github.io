package HackerRank.Praktikum2;

import java.util.Scanner;

public class ParenthesesBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        boolean kondisi = true;
        int panjangKalimat, jumlahHuruf = 1;
        char[] huruf = s.toCharArray();
        panjangKalimat = huruf.length;

        int i,j =0;
        if(s.length()<=100){
            if(s.contains("(") || s.contains("(")){
                for( i=0; i<panjangKalimat; i++){
                    for( j=0; j<panjangKalimat; j++){
                        if(huruf[i]!=' '){//karakter spasi ' ' pada kalimat tidak dihitung jumlahnya
                            if(i!=j && huruf[i]==huruf[j]){//jika terdapat huruf yang sama, kecuali saat membandingkan huruf yg letaknya sama(i!=j),maka:
                                jumlahHuruf++;
                                huruf[j]=' '; //huruf yang sama diubah menjadi karakter spasi
                            }
                            if(panjangKalimat/2==jumlahHuruf){
                            kondisi = true;
                            } else {
                                kondisi = false;
                            }
                            if(j==panjangKalimat-1){
                                jumlahHuruf=1; //Mereset ulang
                            }
                            
                        }
                    }    
                }
            }
            System.out.println(kondisi);
        }
        
    }
}
