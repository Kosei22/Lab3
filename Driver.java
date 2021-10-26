package Lab3;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        Pawn pawn = new Pawn();
        Knight knight = new Knight();
        Bishop bishop = new Bishop();
        Rook rook = new Rook();
        Queen queen = new Queen();
        King king = new King();

        ArrayList<Piece> Pieces = new ArrayList<>(Arrays.asList(pawn, knight, bishop, rook, queen, king));

        for(int i = 0; i < Pieces.size(); i ++){
            Pieces.get(i).move();
        }





    }
}
