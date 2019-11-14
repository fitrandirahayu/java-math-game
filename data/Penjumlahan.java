/*
Created by : Fitrandi Rahayu (K3518033)
*/
package data;

import tampilan.*;
import java.util.Scanner;

// Inheritance
public class Penjumlahan extends Soal {
    
    // Atribut.
    static int inputJawaban;
    static int jawabanBenarnya;
    public static Scanner sc = new Scanner(System.in);

    // Soal Penjumlahan.
    public static void soalPenjumlahan(Player player){
  
        player.setLives(3);
        player.setScore(0);

        // Masuk ke View Menu Penjumlahan.
        View.tampilanPenjumlahan();
        

        /* Jika skor masih dibawah 300 dan nyawa masih diatas 0,
        Maka perintah di dalam bracket while ini
        akan dieksekusi terus menerus.*/

        while((player.getScore() < 300) && (player.getLives() > 0) ) {
        
            // Set bilangan pertama dan kedua secara random sesuai skor player.
            
            if (player.getScore() <= 100) {
                Penjumlahan.setBil1(Penjumlahan.randomNumber(0, 10));
                Penjumlahan.setBil2(Penjumlahan.randomNumber(0, 10));
            }

            else if ((player.getScore() >= 101) && (player.getScore() <= 200)) {
                Penjumlahan.setBil1(Penjumlahan.randomNumber(-10, -1));
                Penjumlahan.setBil2(Penjumlahan.randomNumber(-10, -1));
            }

            else if ((player.getScore() >= 201) && (player.getScore() <= 300)) {
                Penjumlahan.setBil1(Penjumlahan.randomNumber(-10, 10));
                Penjumlahan.setBil2(Penjumlahan.randomNumber(-10, 10));
            }
            
            
            // Cek apakah jawaban yang diinputkan player sudah benar atau belum.
            while (true) {
                try {
                    
                    /* Print pertanyaan dengan memanggil method 'tampilanPenjumlahan'
                    kemudian mengembalikan return berupa inputan player lalu menyimpannya dalam
                    variabel 'inputJawaban'. Kemudian inputan player yang masih berupa String diubah ke Integer.*/
                    inputJawaban = Integer.parseInt(View.tampilanPenjumlahan(Penjumlahan.getBil1(), Penjumlahan.getBil2()));

                    // Menghentikan pengecekan dan melanjutkan program.
                    break;
                  
                // Menanggulangi apabila inputan player tidak valid, maka akan di loop lagi.
                } catch (NumberFormatException e) {

                }
            }
            
            // Cek jawaban yang benar dan memasukkannya ke dalam variabel.
            jawabanBenarnya = Penjumlahan.getBil1() + Penjumlahan.getBil2();

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
            View.tampilanBerhasilPenjumlahan(player);
            sc.nextLine();
            
            View.tampilanMenu(player);
        }

    }
}