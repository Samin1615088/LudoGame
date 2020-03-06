package ludogame;

import java.util.Random;

public class Dice {
    public int Dice() {
        int diceVale =(int) (Math.random()*10)%6;
        return diceVale; 
    }
}
