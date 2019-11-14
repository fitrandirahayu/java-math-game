/*
Created by : Alifia Diah Ayu Pracalita (K3518005)
*/

package tampilan;

import data.*;

public class Main {

    // Main class.
    public static void main(String[] args) {

        // Buat objek baru dan instansiasi nilai awal.
        Player player = new Player();
        

        // Masuk ke tampilan utama untuk input nama.
        // Parameter pertama 'player' untuk passing objek 'player'.
        View.tampilanUtama(player);


        // Masuk ke menu Utama dan menampilkan menu.
        View.tampilanMenu(player);
   }

}