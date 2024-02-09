package HackerRank.Praktikum2;

import java.io.IOException;
import java.util.Scanner;

public class NIM {
     public static void main(String[] args) throws IOException {
      Scanner input = new Scanner(System.in);
        
      String nimMahasiswa, angkatan, fakultas, prodi, jalurMasuk, nomorMahasiswa;
      
      nimMahasiswa = input.nextLine();
      
      angkatan = nimMahasiswa.substring(0,2);

      fakultas = nimMahasiswa.substring(2,5);
      
      switch(fakultas){
         case"515":
         fakultas = "FILKOM";
         break;
         case"514":
         fakultas = "FMIPA";
         break;
         default:
         fakultas = "Unknown";
      }

      prodi = nimMahasiswa.substring(5, 8);

      if(prodi.equals("FILKOM")){
         switch(prodi){
            case"020":
            prodi = "Teknik Informatika";
            break;
            case"030":
            prodi = "Teknik Komputer";
            break;
            case"040":
            prodi = "Sistem Informasi";
            break;
            case"060":
            prodi = "Pendidikan Teknologi Informasi";
            break;
            case"070":
            prodi = "Teknologi Informasi";
            break;
            default:
            prodi = "Unknown";
            break;
      } }else {
         prodi = "Unknown";
      }

      if(prodi.equals("FMIPA")){
         switch(prodi){

            case"050":
            prodi = "Biologi";
            break;
            case"051":
            prodi = "Kimia";
            break;
            case"061":
            prodi = "MatematIka";
            break;
            default:
            prodi = "Unknown";
            break;
         }
      } else {
         prodi = "Unknown";
      }
      

      jalurMasuk = nimMahasiswa.substring(8, 12);

      switch(jalurMasuk){
         case"1111":
         jalurMasuk = "SNBP";
         break;
         case"0111":
         jalurMasuk = "SNBT";
         break;
         case"7111":
         jalurMasuk = "Mandiri";
         break;
         default:
         jalurMasuk = "Unknown";
      }

      nomorMahasiswa = nimMahasiswa.substring(12, 15);
      
      System.out.println("Angkatan: 20" + angkatan);
      System.out.println("Fakultas: " + fakultas);
      System.out.println("Program studi: " + prodi);
      System.out.println("Jalur masuk: " + jalurMasuk);
      System.out.println("Nomor mahasiswa: " + nomorMahasiswa);
   
      input.close();
   }
}
