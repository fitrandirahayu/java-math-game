/*
Created by : Muhammad Ibnu Sina (K3518043)
*/

package data;

import tampilan.*;
import java.util.Scanner;


//Inheritance
public class Pengurangan extends Soal {
    
    // Atribut.
    static int inputJawaban;
    static int jawabanBenarnya;
    public static Scanner sc = new Scanner(System.in);

    // Soal Pengurangan.
    public static void soalPengurangan(Player player){
  
        player.setLives(3);
        player.setScore(0);

        // Masuk ke View Menu Pengurangan.
        View.tampilanPengurangan();
        

        /* Selama skor masih dibawah 300 dan nyawa masih diatas 0,
        Maka perintah di dalam bracket while di bawah ini
        akan dieksekusi terus menerus.*/
        while((player.getScore() < 300) && (player.getLives() > 0) ) {
        
            // Set bilangan pertama dan kedua secara random sesuai skor player.
            if (player.getScore() <= 100) {
                Pengurangan.setBil1(Pengurangan.randomNumber(0, 10));
                Pengurangan.setBil2(Pengurangan.randomNumber(0, 10));
                while (Pengurangan.getBil1() < Pengurangan.getBil2()) {
                    Pengurangan.setBil1(Pengurangan.randomNumber(0, 10));
                    Pengurangan.setBil2(Pengurangan.randomNumber(0, 10));
                }
            }

            else if ((player.getScore() >= 101) && (player.getScore() <= 200)) {
                Pengurangan.setBil1(Pengurangan.randomNumber(-10, -1));
                Pengurangan.setBil2(Pengurangan.randomNumber(-10, -1));
            }

            else if ((player.getScore() >= 201) && (player.getScore() <= 300)) {
                Pengurangan.setBil1(Pengurangan.randomNumber(-10, 10));
                Pengurangan.setBil2(Pengurangan.randomNumber(-10, 10));
            }
            
            
            // Cek apakah jawaban yang diinputkan player sudah benar atau belum.
            while (true) {
                try {
                    
                   /* Print pertanyaan dengan memanggil method 'tampilanPenjumlahan'
                    kemudian mengembalikan return berupa inputan player lalu menyimpannya dalam
                    variabel 'inputJawaban'. Kemudian inputan player yang masih berupa String diubah ke Integer.*/
                    inputJawaban = Integer.parseInt(View.tampilanPengurangan(Pengurangan.getBil1(), Pengurangan.getBil2()));

                    // Menghentikan pengecekan dan melanjutkan program.
                    break;
                  
                // Menanggulangi apabila inputan player tidak valid, maka akan di loop lagi.
                } catch (NumberFormatException e) {
                }
            }
            
            // Cek jawaban yang benar dan memasukkannya ke dalam variabel.
            jawabanBenarnya = Pengurangan.getBil1() - Pengurangan.getBil2();

            // Jika inputan player benar skor ditambah 4.
            if (inputJawaban == jawabanBenarnya) {
                player.setScore(player.getScore() + 4);
                View.separator();
                Soal.setLevel(player.getScore());
                View.jawaban("true", player);

             // Jika inputan player salah skor dikurangi 1 dan nyawa/lives dikurangi 1.
            } else {
                player.setScore(player.getScore() - 1);
                player.setLives(player.getLives() - 1);
                View.separator();
                Soal.setLevel(player.getScore());
                View.jawaban("false", player);
            }
        }

        if (player.getLives() <= 0) {
            View.tampilanNyawaHabis(player);
            sc.nextLine();
            
            View.tampilanMenu(player);
        } else {
            View.tampilanBerhasilPengurangan(player);
            sc.nextLine();
            
            View.tampilanMenu(player);
        }

    }
}