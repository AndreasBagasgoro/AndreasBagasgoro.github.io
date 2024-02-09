package HackerRank.Praktikum2;

import java.util.Scanner;

public class Remote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int ChannelAwal, ChannelSekarang, VolumeAwal, VolumeSekarang;
    ChannelAwal = 1;
    ChannelSekarang = 1;
    VolumeAwal = 50;
    VolumeSekarang = 50;
    boolean tombol;
    
    String Power = input.nextLine();
    if (Power.equalsIgnoreCase("POWER")){
        tombol = true;
        System.out.println("TV ON");
    }else {
        tombol = false;
    }

    while (tombol) {
        String Perintah = input.next();
        if (Perintah.equalsIgnoreCase("POWER")){
            System.out.println("TV OFF");
            break;
        } else if (Perintah.equalsIgnoreCase("MUTE")){
            System.out.println("Volume mute");
            input.nextLine();
            continue;
        } else if (Perintah.equalsIgnoreCase("UNMUTE")){
            System.out.println("Volume sekarang: " + VolumeSekarang);
            input.nextLine();
            continue;
        }else {
        
                String Pergantian = input.next();
                
                //CHANNEL
                if (Perintah.equalsIgnoreCase("CHANNEL")){
                    
                    if (!Pergantian.equalsIgnoreCase("UP")&&!Pergantian.equalsIgnoreCase("DOWN")&&!Pergantian.equalsIgnoreCase("PREV")) {
                    int ChannelAngka = Integer.parseInt(Pergantian);
                    if ((ChannelAngka>30)||(ChannelAngka<1)) {
                        System.out.println("Channel yang dimasukkan tidak valid");

                    }else{
                        ChannelAwal = ChannelSekarang;
                        ChannelSekarang = ChannelAngka;
                        if ((ChannelSekarang>30)||(ChannelSekarang<1)) {
                            System.out.println("Channel tidak valid");
                        
                        }else {
                            System.out.println("Channel sekarang: "+ChannelSekarang);
                        }
                    }
                    }
                
                    switch (Pergantian) {
                        case "UP":
                            ChannelAwal = ChannelSekarang;
                            ChannelSekarang++;
                        
                            if ((ChannelSekarang>30)||(ChannelSekarang<1)) {
                                System.out.println("Channel tidak valid");
                                ChannelSekarang = ChannelAwal;
                            }else{
                                System.out.println("Channel sekarang: "+ChannelSekarang);   
                            }
                            break;

                        case "DOWN":
                            ChannelAwal = ChannelSekarang;
                            ChannelSekarang--;
                            if ((ChannelSekarang>30)||(ChannelSekarang<1)) {
                                System.out.println("Channel tidak valid");
                                ChannelSekarang = ChannelAwal;
                            }else{
                                System.out.println("Channel sekarang: "+ChannelSekarang);
                            }
                            break;

                        default:
                            break;
                    }

                } else if (Perintah.equalsIgnoreCase("VOLUME")) {
                    switch (Pergantian) {
                        case "UP":
                            VolumeAwal = VolumeSekarang;
                            VolumeSekarang+=5;
                        
                            if ((VolumeSekarang>100)||(VolumeSekarang<0)) {
                                System.out.println("Volume tidak valid");
                                VolumeSekarang = VolumeAwal;
                            }else{
                                System.out.println("Volume sekarang: "+VolumeSekarang);
                                input.nextLine();
                            }
                            break;

                        case "DOWN":
                            VolumeAwal = VolumeSekarang;
                            VolumeSekarang-=5;
                        
                            if ((VolumeSekarang>100)||(VolumeSekarang<0)) {
                                System.out.println("Volume tidak valid");
                                VolumeSekarang = VolumeAwal;
                            }else{
                                System.out.println("Volume sekarang: "+VolumeSekarang);
                                input.nextLine();
                            }
                            break;

                        default:
                            break;
                    }
                } else if (Perintah.equals("PREV")) {
                    if (Pergantian.equalsIgnoreCase("CHANNEL")) {
                        System.out.println("Channel sekarang: " + ChannelAwal);
                        ChannelSekarang = ChannelAwal;
                    }
                }
    }
    }
    input.close();
}
}
        

        




    
