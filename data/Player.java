/*
Created by : Shella Fatmawati (K3518055)
*/
package data;

public class Player {
    
    
    // Attribut Player

    private String nama;
    private int score;
    private int lives;
    

    // Constructor Player

    public Player() {
        nama = "PlayerX";
        score = 0;
        lives = 3;
    }
    

    // Method Setter dan Getter.

    public void setNama(String inputNama){
        nama = inputNama;
    }
    
    public String getNama(){
        return nama;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}