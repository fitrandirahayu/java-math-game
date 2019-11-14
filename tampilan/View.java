/*
Created by : Fitrandi Rahayu (K3518033)
*/
package tampilan;

import data.*;

import java.text.DecimalFormat;
import java.util.Scanner;


public class View {
    
    public static Scanner sc = new Scanner(System.in);

    public static void tampilanUtama(Player player) {
        separator();
        System.out.println("*********************");
        System.out.println("+-+-+ Game Matematika +-+-+");
        System.out.println("===> Kelompok 5 Kelas A <===");
        System.out.println("*********************");
        System.out.print("Masukkan Nama Anda : ");

        String in = sc.nextLine();

        if ((in.isEmpty() == true) || (in == " ")) {
            player.setNama("PlayerX");
        } else {
            player.setNama(in);
        }

        separator();
    }
    
    public static void tampilanMenu(Player player){
        separator();
        System.out.println("*********************");
        System.out.println("+-+-+ Game Matematika +-+-+");
        System.out.println("===> Kelompok 5 Kelas A <===");
        System.out.println("*********************");
        System.out.println("");
        System.out.println("Menu :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Keluar");
        System.out.println("");
        System.out.print("Pilih opsi soal : ");

        switch (sc.nextLine()) {
            case "1":
                Soal.penjumlahan(player);
                break;

            case "2":
                Soal.pengurangan(player);
                break;
                
            case "3":
                separator();
                separatorLine();
                System.out.println("Anda Keluar dari Game !!");
                separatorLine();
                break;

            default:
                tampilanMenu(player);
                break;
        }
        separator();
    }


    public static void tampilanPenjumlahan() {
        separator();

        System.out.println("************************");
        System.out.println("Game Math - Penjumlahan");
        System.out.println("************************");
        
        separator();
    }

    public static String tampilanPenjumlahan(int bil1, int bil2) {
        
        DecimalFormat dFormat = new DecimalFormat();
        dFormat.setNegativePrefix("(-");
        dFormat.setNegativeSuffix(")");

        System.out.println("Berapakah hasil dari " + dFormat.format(bil1) + " + " + dFormat.format(bil2) + " ?");
        System.out.print("Jawab : ");

        String inputJawaban = sc.nextLine();

        return inputJawaban;
    }



    public static void tampilanPengurangan() {
        separator();

        System.out.println("************************");
        System.out.println("Game Math - Pengurangan");
        System.out.println("************************");
        
        separator();
    }

    public static String tampilanPengurangan(int bil1, int bil2) {

        DecimalFormat dFormat = new DecimalFormat();
        dFormat.setNegativePrefix("(-");
        dFormat.setNegativeSuffix(")");

        System.out.println("Berapakah hasil dari " + dFormat.format(bil1) + " - " + dFormat.format(bil2) + " ?");
        System.out.print("Jawab : ");

        String inputJawaban = sc.nextLine();

        return inputJawaban;
    }
    
    
    
    public static void separatorLine() {
        System.out.println("-----------------------------");
    }
    
    public static void separator() {
        System.out.println("");
    }



    public static void jawaban(String jawab, Player player) {

        switch(jawab){
            
            case "true":
                System.out.println("[Selamat " + player.getNama() + ", Kamu BENAR :) ] [Skor: " + player.getScore() + "] [Lives: " + player.getLives() + "] [Level: " + Soal.getLevel() + "]");
                break;
            
            case "false":
                System.out.println("[Sayang sekali, jawaban kamu SALAH :( ] [Skor: " + player.getScore() + "] [Lives: " + player.getLives() + "] [Level: " + Soal.getLevel() + "]");
                break;
            }

        separator();
        separatorLine();
        separator();
    }

    public static void tampilanNyawaHabis(Player player) {
        System.out.println("[Hai " + player.getNama() + ", Kamu kehabisan kesempatan nih :( . Ayo coba lagi dari awal ! :) ]");
        System.out.println("Tekan ENTER untuk kembali ke Menu.");
        separator();
        separatorLine();
    }
    
    public static void tampilanBerhasilPenjumlahan(Player player) {
        System.out.println("[Selamat " + player.getNama() + ", Kamu menyelesaikan soal penjumlahan dengan baik. Silahkan dicoba soal pengurangannya ya]");
        System.out.println("Tekan ENTER untuk kembali ke Menu.");
        separator();
        separatorLine();
    }

    public static void tampilanBerhasilPengurangan(Player player) {
        System.out.println("[Selamat " + player.getNama() + ", Kamu menyelesaikan soal pengurangan dengan baik. Silakan dicoba soal penjumlahannya ya]");
        System.out.println("Tekan ENTER untuk kembali ke Menu.");
        separator();
        separatorLine();
    }

}