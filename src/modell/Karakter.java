package modell;

import java.util.Random;

public class Karakter {

    private int hp;
    private int hely;
    private int sebzes;
    private int hatotav;

    public Karakter(int hely, int sebzes, int hatotav) {
        this(10, hely, sebzes, hatotav);
    }

    public Karakter(int hp, int hely, int sebzes, int hatotav) {
        this.hp = hp;
        this.hely = hely;
        this.sebzes = sebzes;
        this.hatotav = hatotav;
    }

    public void rndLep(int max) {
        this.hely = new Random().nextInt(max) + 1;
    }

    public boolean uthetE(int masikKord) { // másik karakter kordinátája
        int ertek = this.hely - masikKord;
        boolean all = ertek <= hatotav && ertek >= hatotav * (-1);
        return all;
    }

    public void sebzodik(int dmg) {
        this.hp = this.hp - dmg;
    }

    public int getHp() {
        return hp;
    }

    public int getHely() {
        return hely;
    }

    public int getSebzes() {
        return sebzes;
    }

    public int getHatotav() {
        return hatotav;
    }

}
