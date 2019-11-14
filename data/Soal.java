/*
Created by : Shella Fatmawati (K3518055)
*/
package data;

public class Soal {
    
    // Atribut
    private static int bil1;
    private static int bil2;
    private static int level;


    public static void penjumlahan(Player player) {
        Penjumlahan.soalPenjumlahan(player);
    }

    public static void pengurangan(Player player) {
        Pengurangan.soalPengurangan(player);
    }


    // Method untuk random bilangan.

    public static int randomNumber(int min, int max) {

        if (min >= max) {
			throw new IllegalArgumentException("Max harus lebih besar dari Min");
		}

		return (int)(Math.random() * ((max - min) + 1)) + min;

    }
    
    
    // Method Setter dan Getter 
    

    public static int getBil1() {
        return bil1;
    }

    public static void setBil1(int inBil1) {
        bil1 = inBil1;
    }

    public static int getBil2() {
        return bil2;
    }

    public static void setBil2(int inBil2) {
        bil2 = inBil2;
    }

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int score) {
        if (score <= 100) {
            Soal.level = 1;
        }
        
        else if ((score >= 101) && (score <= 200)) {
            Soal.level = 2;
        }

        else if ((score >= 201) && (score <= 300)) {
            Soal.level = 3;
        }
    }
    
}