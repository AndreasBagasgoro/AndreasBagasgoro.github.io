package HackerRank.Praktikum2;

import java.util.Scanner;

public class kasirRestoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI KIKO'RESTAURANT");

        System.out.println("LIST MAKANAN:");
        System.out.println("1. Nasi Lalapan 13.000");
        System.out.println("2. Mi ayam 9.000");
        System.out.println("3. Nasi Campur 10.000");
        System.out.println("4. Nasi Pecel 10.000");
        System.out.println("0. Keluar");
      
        int totalMakanan = 0;
        int totalMinuman= 0;
        int hargaMakanan = 0;
        int hargaMinuman = 0;
        int jumlahOrderan;
        while(true){
            System.out.println("Plih order dan masukkan jumlah:");
            int orderMakanan = input.nextInt();
            if (orderMakanan == 0){
                break;
            } else if(orderMakanan!=1 && orderMakanan!=2 && orderMakanan!=3 && orderMakanan!=4){
                System.out.println("Pilihan tidak ada");
            }
            jumlahOrderan = input.nextInt();
            if (orderMakanan == 1){
                totalMakanan += jumlahOrderan*13000;
            } 
            if (orderMakanan == 2){
                totalMakanan += jumlahOrderan*9000;
            } 
            if (orderMakanan == 3){
                totalMakanan += jumlahOrderan*10000;
            } 
            if (orderMakanan == 4){
                totalMakanan += jumlahOrderan*10000;
            } 
            
            
        }
        
        System.out.println("LIST MINUMAN:");
        System.out.println("1. Teh 5.000");
        System.out.println("2. Jeruk 6.000");
        System.out.println("3. Susu 8.000");
        System.out.println("0. Keluar");
        while(true){
            System.out.println("Pilih order dan masukkan jumlah:");
            int orderMinuman = input.nextInt();
            if(orderMinuman == 0){
                break;
            } else if (orderMinuman!=1 && orderMinuman!=2 && orderMinuman!=3){
                System.out.println("Pilihan tidak ada");
                continue;
            }
            jumlahOrderan = input.nextInt();
            if (orderMinuman == 1){
                hargaMinuman = jumlahOrderan * 5000;
            }
            if (orderMinuman == 2){
                hargaMinuman = jumlahOrderan * 6000;
            }
            if (orderMinuman == 3){
                hargaMinuman = jumlahOrderan * 8000;
            }
            totalMinuman += hargaMinuman;

        }
    
        int totalHarga = totalMakanan + totalMinuman;
        double totalPajak = (totalHarga * 0.11) + totalHarga;
        System.out.printf("Total belanja: %.0f\n", totalPajak);
        System.out.println("Masukkan uang untuk membayar:");
        int uangBayar = input.nextInt();
        
        while(true){
            if (uangBayar>totalPajak){
                int kembalian =  uangBayar - (int)totalPajak;
                
            } else if(uangBayar<totalHarga){
                int uangKurang = (int)totalPajak - uangBayar;
                System.out.println("Uang yang dimasukkan kurang "+ uangKurang + ". Masukan uang lagi:");
                int uangTambah = input.nextInt();
                int kembalianBaru = uangTambah - uangKurang;
                System.out.println("Kembalian: " + kembalianBaru);
                System.out.println("TERIMA KASIH TELAH BERBELANJA DI KIKO'S RESTAURANT");
                break;
            } else {
                System.out.println("TERIMA KASIH TELAH BERBELANJA DI KIKO'S RESTAURANT");
            }
            
        }
        }

}
