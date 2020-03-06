package ludogame;

import java.util.ArrayList;

public class Board {
    ArrayList<Square> boardSquare = new ArrayList<>();

    public Board() {
        for(int i=0; i<100; i++){
            boardSquare.add(new Square(i));
        }
    }
}
