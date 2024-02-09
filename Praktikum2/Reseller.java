package HackerRank.Praktikum2;

import java.util.Scanner;

public class Reseller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      String nama, namaBarang;
      double jumlah, hargaSatuan;

      nama = input.nextLine();
      namaBarang = input.nextLine();
      hargaSatuan = input.nextInt();
      jumlah = input.nextInt();

      // 
      double total = jumlah * hargaSatuan;
      double pajak = Math.round(total* 7 / 100);
      double modal = total + pajak;

      // Setelah Penjualan
      double totalPenjualan = modal * 110 / 100;
      double hargaSatuan2 = totalPenjualan / jumlah;
      double totalKeuntungan = totalPenjualan - total;

      System.out.printf("============================================%n");
      System.out.printf("===Aplikasi Untuk Memulai Bisnis Reseller===%n");
      System.out.printf("============================================%n");
      System.out.printf("%-17s:%26s%n", "Nama", nama);
      System.out.printf("%-17s:%26s%n", "Nama Barang", namaBarang);
      System.out.printf("%-17s:%26.0f%n", "Jumlah" ,jumlah);
      System.out.printf("%-17s:%26.0f%n", "Harga Satuan", hargaSatuan);
      System.out.printf("============================================%n");
      System.out.printf("%-17s:%26.0f%n", "Total", total);
      System.out.printf("%-17s:%26.0f%n", "Pajak 7%", pajak);
      System.out.printf("%-17s:%26.0f%n", "Modal", modal);
      System.out.printf("============================================\n");
      System.out.println("Harga Jual kembali 10% keuntungan dari Modal");
      System.out.printf("============================================%n");
      System.out.printf("%-17s:%26.0f%n", "Total Penjualan", totalPenjualan);
      System.out.printf("%-17s:%26.0f%n", "Harga Satuan", hargaSatuan2);
      System.out.printf("%-17s:%26.0f%n", "Total Keuntungan", totalKeuntungan);
      System.out.printf("============================================\n");

      input.close();


    }
}
