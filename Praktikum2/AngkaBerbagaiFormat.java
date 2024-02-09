package HackerRank.Praktikum2;

import java.util.Scanner;


public class AngkaBerbagaiFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Bilangan = input.nextLine();
        String [] PisahSpasi = Bilangan.split(" ");
        String [] PisahGaring = Bilangan.split("/");
        String [] PisahTitik = Bilangan.split("\\.");
        
            if (PisahTitik.length == 1 && PisahGaring.length==1 && PisahSpasi.length==1){
                double desimal = Double.parseDouble(Bilangan);
                if (desimal==0){
                    System.out.printf("Desimal: %.0f\n",desimal);
                    System.out.printf("Pecahan campuran: %.0f\n",desimal);
                    System.out.printf("Pecahan: %.0f\n",desimal);
                } else {
                    System.out.println("Desimal: "+desimal);
                    System.out.printf("Pecahan campuran: %s/1\n",(Bilangan));
                    System.out.printf("Pecahan: %s/1\n",(Bilangan));
                }
            }
        
            else if (PisahSpasi.length == 2) {
                String [] PisahSpasi2 = PisahSpasi[1].split("/");
                double depan = Double.parseDouble(PisahSpasi2[0]);
                double tengah = Double.parseDouble(PisahSpasi2[0]);
                double belakang = Double.parseDouble(PisahSpasi2[1]);
                double tengah2 = tengah;
                double belakang2 = belakang;
                //Desimal
                System.out.println("Desimal: "+(depan+(tengah/belakang)));
                //Pecahan campuran
                        while (tengah != 0) {
                            double pencariFPB = belakang;
                            belakang = tengah;
                            tengah = pencariFPB % tengah;
                        }
                
                        double pembilang = tengah2 / belakang;
                        double penyebut = belakang2 / belakang;
                System.out.printf("Pecahan campuran: %.0f %.0f/%.0f\n",depan,pembilang,penyebut);
                //Pecahan
                System.out.printf("Pecahan: %.0f/%.0f\n",((depan*penyebut)+pembilang),penyebut);
            }
        
            else if (PisahGaring.length == 2 ) {
                
                double depan = Double.parseDouble(PisahGaring[0]);
                double belakang = Double.parseDouble(PisahGaring[1]);
                double desimal = depan/belakang;
                double desimal2 = Math.floor(desimal);
                double modulo = depan%belakang;
                double modulo2 = modulo;
                double belakang2 = belakang;
        
                if (depan >= belakang) {
                    if (modulo == 0) {
                        System.out.println("Desimal: " + desimal);
                        System.out.println("Pecahan campuran: " + desimal);
                        System.out.println("Pecahan: " + desimal);
                    } else {
                        // Desimal
                        System.out.println("Desimal: " + desimal);
                        // Pecahan Campuran
                        while (modulo != 0) {
                            double pencariFPB = belakang;
                            belakang = modulo;
                            modulo = pencariFPB % modulo;
                        }
                
                        double pembilang = modulo2 / belakang;
                        double penyebut = belakang2 / belakang;
                        System.out.printf("Pecahan campuran: %.0f %.0f/%.0f\n", desimal2, pembilang, penyebut);
        
                        //Pecahan
                        System.out.printf("Pecahan: %s",Bilangan);
                    }
                }else {
                    //Desimal
                    System.out.println("Desimal: "+desimal);
                    //Pecahan Campuran
                        while (modulo != 0) {
                            double pencariFPB = belakang;
                            belakang = modulo;
                            modulo = pencariFPB % modulo;
                        }
                
                        double pembilang = modulo2 / belakang;
                        double penyebut = belakang2 / belakang;
                        System.out.printf("Pecahan campuran: %.0f/%.0f\n",pembilang,penyebut);
        
                    
                    //Pecahan
                    System.out.printf("Pecahan: %.0f/%.0f",pembilang,penyebut);
                }
                
            }
        
            else if (PisahTitik.length == 2) {
                //desimal
                System.out.println("Desimal: "+Bilangan);
        
                //Campuran
                int digit = PisahTitik[1].length();
                double depan = Double.parseDouble(PisahTitik[0]);
                double belakang = Double.parseDouble(PisahTitik[1]);
                double belakang2 = belakang;
                double belakang3 = belakang;
                double pembagi = 10;
        
                pembagi = Math.pow(pembagi, digit);
                double pembagi2 = pembagi;
                belakang3 = belakang;       
                
                
                while (belakang3 != 0) {
                    double pencariFPB = belakang3;
                    belakang3 = pembagi % belakang3;
                    pembagi = pencariFPB;
                }
        
                double pembilang = belakang2/pembagi;
                double penyebut = pembagi2/pembagi;
                if (depan>0) {
                    System.out.printf("Pecahan campuran: %.0f %.0f/%.0f\n",depan,pembilang,penyebut);
                }else{
                    System.out.printf("Pecahan campuran: %.0f/%.0f\n",pembilang,penyebut);
                }
        
                //Pecahan
                double pembilang2 = depan*penyebut;
                pembilang2+=pembilang;
        
                System.out.printf("Pecahan: %.0f/%.0f",pembilang2,penyebut);
            }
            
            input.close();



    }
}
